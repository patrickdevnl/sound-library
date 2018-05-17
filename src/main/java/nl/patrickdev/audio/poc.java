package nl.patrickdev.audio;

import nl.patrickdev.audio.notegenerator.NoteGenerator;
import nl.patrickdev.audio.notegenerator.VaderJacob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class poc {
    private static final double SECONDS_PER_MINUTE = 60;

    private static final int SAMPLES_PER_MINUTE = 28000;
    private static final int BITS_PER_SAMPLE = 8;
    private static final int CHANNELS = 1;
    private static final boolean SIGNED = true;
    private static final boolean BIG_ENDIAN = true;

    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        double beatsPerMinute = 120;

        NoteGenerator song = new VaderJacob();
        Note[] notes = song.getNotes();
        double duration = SECONDS_PER_MINUTE / beatsPerMinute * song.getDuration();

        byte[] data = new byte[(int) (SAMPLES_PER_MINUTE * duration)];

        int done = 0;

        for (Note note : notes) {
            double hertz = note.getFrequency();
            int samples = (int) (60 / beatsPerMinute * note.getDuration() * SAMPLES_PER_MINUTE);

            for (int sample = 0; sample < samples; sample++) {
                double progressThroughWave = sample / (SAMPLES_PER_MINUTE / hertz);
                double value = Math.sin(progressThroughWave * Math.PI);
                data[sample + done] = (byte) (value * 127);
            }

            done += samples;
        }


        AudioFormat af = new AudioFormat(SAMPLES_PER_MINUTE, BITS_PER_SAMPLE,  CHANNELS, SIGNED, BIG_ENDIAN);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);

        sdl.open(af);

        sdl.start();

        sdl.write(data, 0, data.length);
        Thread.sleep((long) ((duration + 1) * 1000));


    }
}
