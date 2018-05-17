package nl.patrickdev.audio.notegenerator;

import nl.patrickdev.audio.Note;

public abstract class NoteGenerator {
    private Note[] notes;

    NoteGenerator() {
    }

    void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public Note[] getNotes() {
        return notes;
    }

    public double getDuration() {
        double duration = 0;
        for (Note note : notes) {
            duration += note.getDuration();
        }
        return duration;
    }
}
