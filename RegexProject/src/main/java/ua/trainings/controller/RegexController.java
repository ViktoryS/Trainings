package ua.trainings.controller;

import ua.trainings.model.NoteBuilder;
import ua.trainings.model.Notebook;
import ua.trainings.utils.RegexConstants;
import ua.trainings.utils.Utils;
import ua.trainings.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexController {
    Notebook notebook;

    public RegexController(Notebook notebook){
        this.notebook = notebook;
    }

    public void menu(Scanner in, View view){
        boolean flag = true;
        while(flag) {
            view.menu();
            switch (checkIntValue(in, view)){
                case 1:
                    addNote(view,in);
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

    public void addNote(View view, Scanner in){
        NoteBuilder builder = new NoteBuilder(notebook);
        String input;
        view.addNote();

        view.inputName();
        input = input(in, RegexConstants.NAME_REGEX, view);
        builder.setName(input + view.DOT);

        view.inputNickName();
        input = input(in, RegexConstants.NICKNAME_REGEX, view);
        builder.setNickame(input);

        view.inputMobilePhone();
        input = input(in, RegexConstants.MOBILEPHONE_REGEX, view);
        builder.setMobilePhone(input);

        view.inputHomePhone();
        input = input(in, RegexConstants.HOMEPHONE_REGEX, view);
        builder.setHomePhone(input);

        view.inputEmail();
        input = input(in, RegexConstants.EMAIL_REGEX, view);
        builder.setEmail(input);

        view.thanksForNewNote();
        notebook.addNote(builder.getNote());
    }

    public String input(Scanner in, String regex, View view){
        String input;
        while(true){
            if (in.hasNext()){
                if (Utils.checkNull(input = in.nextLine()) && checkRegex(regex, input)){
                    return input;
                }
                view.inputWrong();
            }
        }
    }

    public boolean checkRegex(String regex, String input){
        return Pattern.matches(regex, input);
    }

}
