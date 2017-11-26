package ua.trainings.facade;

public class Authorizator {
    private DB db;

    public Authorizator(DB db) {
        this.db = db;
    }

    public boolean authorizate(String name, String password){
        return db.search(name, password) != null;
    }
}
