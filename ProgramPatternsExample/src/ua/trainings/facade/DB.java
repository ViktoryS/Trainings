package ua.trainings.facade;

import java.util.HashSet;
import java.util.Set;

public class DB {
    private Set<User> users;

    public DB() {
        initUsers();
    }

    private void initUsers(){
        users = new HashSet<>();
        users.add(new User("Yurii", "1234"));
        users.add(new User("Vasya", "1111"));
        users.add(new User("Petya", "2222"));
        users.add(new User("Tanya", "3333"));
    }

    public User search(String name, String password){
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)
                    && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
