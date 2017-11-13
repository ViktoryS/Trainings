package ua.trainings.controller;

import ua.trainings.model.Notebook;
import ua.trainings.view.View;

import java.util.Scanner;

public class Controller {
    View view;
    Notebook notebook;
    RegexController regexController;

    public Controller(View view, Notebook notebook){
        this.view = view;
        this.notebook = notebook;
    }

    public void processUser(){
        Scanner in = new Scanner(System.in);
        regexController = new RegexController(notebook);
        view.welcome();
        regexController.menu(in, view);
    }
}
