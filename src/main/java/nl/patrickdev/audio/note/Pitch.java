package nl.patrickdev.audio.note;

public class Pitch {
    public static final double A0 = 27.499999999999947d;
    public static final double Ais0 = 29.13523509488056d;
    public static final double B0 = 30.867706328507698d;
    public static final double C1 = 32.703195662574764d;
    public static final double Cis1 = 34.647828872108946d;
    public static final double D1 = 36.708095989675876d;
    public static final double Dis1 = 38.890872965260044d;
    public static final double E1 = 41.20344461410867d;
    public static final double F1 = 43.65352892912541d;
    public static final double Fis1 = 46.24930283895422d;
    public static final double G1 = 48.99942949771858d;
    public static final double Gis1 = 51.913087197493056d;
    public static final double A1 = 54.999999999999915d;
    public static final double Ais1 = 58.270470189761156d;
    public static final double B1 = 61.73541265701542d;
    public static final double C2 = 65.40639132514957d;
    public static final double Cis2 = 69.29565774421793d;
    public static final double D2 = 73.4161919793518d;
    public static final double Dis2 = 77.78174593052012d;
    public static final double E2 = 82.40688922821738d;
    public static final double F2 = 87.30705785825087d;
    public static final double Fis2 = 92.4986056779085d;
    public static final double G2 = 97.99885899543722d;
    public static final double Gis2 = 103.82617439498618d;
    public static final double A2 = 109.99999999999989d;
    public static final double Ais2 = 116.54094037952237d;
    public static final double B2 = 123.4708253140309d;
    public static final double C3 = 130.8127826502992d;
    public static final double Cis3 = 138.59131548843592d;
    public static final double D3 = 146.83238395870364d;
    public static final double Dis3 = 155.56349186104035d;
    public static final double E3 = 164.81377845643485d;
    public static final double F3 = 174.61411571650183d;
    public static final double Fis3 = 184.9972113558171d;
    public static final double G3 = 195.99771799087452d;
    public static final double Gis3 = 207.65234878997245d;
    public static final double A3 = 219.9999999999999d;
    public static final double Ais3 = 233.08188075904488d;
    public static final double B3 = 246.94165062806198d;
    public static final double C4 = 261.6255653005985d;
    public static final double Cis4 = 277.182630976872d;
    public static final double D4 = 293.66476791740746d;
    public static final double Dis4 = 311.1269837220808d;
    public static final double E4 = 329.62755691286986d;
    public static final double F4 = 349.2282314330038d;
    public static final double Fis4 = 369.99442271163434d;
    public static final double G4 = 391.99543598174927d;
    public static final double Gis4 = 415.3046975799451d;
    public static final double A4 = 440.0d;
    public static final double Ais4 = 466.1637615180899d;
    public static final double B4 = 493.8833012561241d;
    public static final double C5 = 523.2511306011974d;
    public static final double Cis5 = 554.3652619537443d;
    public static final double D5 = 587.3295358348153d;
    public static final double Dis5 = 622.253967444162d;
    public static final double E5 = 659.2551138257401d;
    public static final double F5 = 698.456462866008d;
    public static final double Fis5 = 739.988845423269d;
    public static final double G5 = 783.990871963499d;
    public static final double Gis5 = 830.6093951598907d;
    public static final double A5 = 880.0000000000003d;
    public static final double Ais5 = 932.3275230361803d;
    public static final double B5 = 987.7666025122488d;
    public static final double C6 = 1046.5022612023952d;
    public static final double Cis6 = 1108.7305239074892d;
    public static final double D6 = 1174.659071669631d;
    public static final double Dis6 = 1244.5079348883246d;
    public static final double E6 = 1318.5102276514808d;
    public static final double F6 = 1396.912925732017d;
    public static final double Fis6 = 1479.977690846539d;
    public static final double G6 = 1567.9817439269987d;
    public static final double Gis6 = 1661.218790319782d;
    public static final double A6 = 1760.000000000002d;
    public static final double Ais6 = 1864.6550460723618d;
    public static final double B6 = 1975.5332050244986d;
    public static final double C7 = 2093.0045224047913d;
    public static final double Cis7 = 2217.4610478149793d;
    public static final double D7 = 2349.3181433392633d;
    public static final double Dis7 = 2489.0158697766506d;
    public static final double E7 = 2637.020455302963d;
    public static final double F7 = 2793.8258514640347d;
    public static final double Fis7 = 2959.9553816930793d;
    public static final double G7 = 3135.963487853999d;
    public static final double Gis7 = 3322.437580639566d;
    public static final double A7 = 3520.0000000000055d;
    public static final double Ais7 = 3729.310092144725d;
    public static final double B7 = 3951.0664100489994d;
    public static final double C8 = 4186.009044809585d;


    /**
     * The code below was used to generate the pitches that are listed above
     * Loop through all the keys on a piano (A0 - C8) and generate a pitch for them
     */
    private static void generatePitches() {
        char note = 'A';
        int octave = 0;
        int relativePositionToC4 = -23;

        while (true) {
            printNote(note, false, octave, relativePositionToC4);
            if (note == 'B') {
                octave++;
            } else if (note == 'C' && octave == 8) {
                break;
            } else if (note != 'E') {
                printNote(note, true, octave, ++relativePositionToC4);
            }

            relativePositionToC4++;
            if (note++ == 'G') {
                note = 'A';
            }
        }
    }

    /**
     * Print the Pitch declaration to System.out
     * @param note The character of the note ('A' - 'G')
     * @param sharp Whether it's sharp or not (A# as opposed to A)
     * @param octave Which octave (0 - 8)
     * @param relativePositionToC4 Position relative to C4. C5 would be 12. A3 would be -3.
     */
    private static void printNote(char note, boolean sharp, int octave, int relativePositionToC4) {
        double frequency = 440d * Math.pow(Math.pow(2, 1.0 / 12), relativePositionToC4 - 25);
        System.out.printf("public static final double %s%s%s = %sd;\n",
                note,
                sharp ? "is" : "",
                octave,
                frequency);
    }
}
