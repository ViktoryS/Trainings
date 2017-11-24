package ua.trainings.controller;

import ua.trainings.model.Notebook;
import ua.trainings.view.View;

import java.util.Scanner;

public class Controller {
    View view;
    Notebook notebook;
    EntityController entityController;

    public Controller(View view, Notebook notebook){
        this.view = view;
        this.notebook = notebook;
    }

    public void processUser(){
        Scanner in = new Scanner(System.in);
        entityController = new EntityController(notebook,view);
        view.welcome();
        menu(in, view);
    }

    public void menu(Scanner in, View view){
        boolean flag = true;
        while(flag) {
            view.menu();
            switch (checkIntValue(in, view)){
                case 1:
                    entityController.addNote(in);
                    break;
                case 2:
                    view.printObject(notebook.getNotes());
                    break;
                case 3:
                    view.exit();
                    flag = false;
                    break;
            }
        }
    }

    public int checkIntValue(Scanner in, View view){
        int value;
        while(true){
            if(in.hasNextInt()){
                if((value = in.nextInt()) > 0 && value < 4){
                    return value;
                }
            }
            view.inputWrong();
        }
    }
}
