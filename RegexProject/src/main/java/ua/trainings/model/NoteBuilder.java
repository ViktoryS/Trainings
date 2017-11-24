package ua.trainings.model;

public class NoteBuilder {
    private Notebook notebook;
    private Notebook.Note note;

    public NoteBuilder(Notebook notebook){
        this.notebook = notebook;
    }

    public NoteBuilder createNote(){
        note = notebook.new Note();
        return this;
    }

    public NoteBuilder buildName(String name){
        note.setName(name);
        return this;
    }

    public NoteBuilder buildNickame(String nickname){
        note.setNickName(nickname);
        return this;
    }

    public NoteBuilder buildMobilePhone(String mobilePhone){
        note.setMobilePhone(mobilePhone);
        return this;
    }

    public NoteBuilder buildHomePhone(String homePhone){
        note.setHomePhone(homePhone);
        return this;
    }

    public NoteBuilder buildEmail(String email){
        note.setEmail(email);
        return this;
    }

    public Notebook.Note getNote() {
        return note;
    }
}
