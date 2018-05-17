package nl.patrickdev.audio.notegenerator;

import nl.patrickdev.audio.Note;

public class VaderJacob extends NoteGenerator {

    public VaderJacob() {
        Note[] notes = new Note[]{
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 2), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440, 1),
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 2), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 5), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 2),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 5), 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 2),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 9), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 5), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 9), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 7), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 5), 0.5),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), 4), 1),
                new Note(440, 1),
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), -5), 1),
                new Note(440, 2),
                new Note(440, 1),
                new Note(440 * Math.pow(Math.pow(2, 1/12d), -5), 1),
                new Note(440, 2)
        };

        this.setNotes(notes);
    }
}
