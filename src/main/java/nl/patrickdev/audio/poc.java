package nl.patrickdev.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.Random;

public class poc {
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        int sampleRate = 88200;
        int bitsPerSample = 8;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = true;

        int notes = 100;
        int duration = 10;
        int samplesPerNote = sampleRate / notes * duration;
        byte[] data = new byte[sampleRate * duration];
        Random r = new Random();
        for (int note = 0; note < notes; note++) {
            double hertz = 220 * Math.pow(13d / 12d, r.nextInt(40));
            for (int sample = 0; sample < samplesPerNote; sample++) {
                double progressThroughWave = sample / (sampleRate / hertz);
                double value = Math.sin(progressThroughWave * Math.PI);
                data[sample + note * samplesPerNote] = (byte) (value * 127);
            }
        }


        AudioFormat af = new AudioFormat(sampleRate, bitsPerSample, channels, signed, bigEndian);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);

        sdl.start();

        sdl.write(data, 0, sampleRate * duration);
        Thread.sleep((duration + 1) * 1000);


    }
}
