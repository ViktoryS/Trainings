package ua.trainings.model;

import ua.trainings.exception.WrongValueException;

import java.util.LinkedHashSet;
import java.util.Set;

public class Notebook {
    private Set<Note> notes;
    public Notebook(){
        notes = new LinkedHashSet<>();
    }

    public void addNote(Note note) throws WrongValueException{
        if(nickNameExists(note)){
            throw new WrongValueException("Such nickname already exists", note.nickname);
        }else {
            notes.add(note);
        }
    }

    private boolean nickNameExists(Note newNote){
        for (Note note : notes) {
            if(note.nickname.equals(newNote.nickname))
                return true;
        }
        return false;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public class Note{
        private String name;
        private String nickname;
        private String mobilePhone;
        private String homePhone;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNickName() {
            return nickname;
        }

        public void setNickName(String nickname) {
            this.nickname = nickname;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getHomePhone() {
            return homePhone;
        }

        public void setHomePhone(String homePhone) {
            this.homePhone = homePhone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString(){
            return null;
        }
    }
}
