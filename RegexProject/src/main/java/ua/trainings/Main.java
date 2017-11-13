package ua.trainings;

import ua.trainings.controller.Controller;
import ua.trainings.model.Notebook;
import ua.trainings.view.View;

public class Main {

    public static void main(String[] args) {
        new Controller(new View(), new Notebook()).processUser();
    }
}
