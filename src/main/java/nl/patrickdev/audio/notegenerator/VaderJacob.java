package nl.patrickdev.audio.notegenerator;

import nl.patrickdev.audio.Note;

import static nl.patrickdev.audio.note.Pitch.*;

public class VaderJacob extends NoteGenerator {

    public VaderJacob() {
        Note[] notes = new Note[]{
                new Note(C4, 1),
                new Note(D4, 1),
                new Note(E4, 1),
                new Note(C4, 1),

                new Note(C4, 1),
                new Note(D4, 1),
                new Note(E4, 1),
                new Note(C4, 1),

                new Note(E4, 1),
                new Note(F4, 1),
                new Note(G4, 2),

                new Note(E4, 1),
                new Note(F4, 1),
                new Note(G4, 2),

                new Note(G4, 0.5),
                new Note(A4, 0.5),
                new Note(G4, 0.5),
                new Note(F4, 0.5),
                new Note(E4, 1),
                new Note(C4, 1),

                new Note(G4, 0.5),
                new Note(A4, 0.5),
                new Note(G4, 0.5),
                new Note(F4, 0.5),
                new Note(E4, 1),
                new Note(C4, 1),

                new Note(C4, 1),
                new Note(G3, 1),
                new Note(C4, 2),

                new Note(C4, 1),
                new Note(G3, 1),
                new Note(C4, 2)
        };

        this.setNotes(notes);
    }
}
