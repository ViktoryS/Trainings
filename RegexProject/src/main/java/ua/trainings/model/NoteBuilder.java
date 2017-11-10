package ua.trainings.model;

public class NoteBuilder {
    private Notebook notebook;
    private Notebook.Note note;

    public NoteBuilder(Notebook notebook){
        this.notebook = notebook;
    }

    public NoteBuilder createNote(){
        notebook.addNote(note = notebook.new Note());
        return this;
    }

    public NoteBuilder setName(String name){
        note.setName(name);
        return this;
    }

    public NoteBuilder setNickame(String nickname){
        note.setNickname(nickname);
        return this;
    }

    public NoteBuilder setMobilePhone(String mobilePhone){
        note.setMobilePhone(mobilePhone);
        return this;
    }

    public NoteBuilder setHomePhone(String homePhone){
        note.setHomePhone(homePhone);
        return this;
    }

    public NoteBuilder setEmail(String email){
        note.setEmail(email);
        return this;
    }

    public Notebook.Note getNote() {
        return note;
    }
}
