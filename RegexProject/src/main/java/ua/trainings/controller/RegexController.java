package ua.trainings.controller;

import ua.trainings.view.View;
import ua.trainings.model.NoteBuilder;
import ua.trainings.model.Notebook;
import ua.trainings.utils.RegexConstants;
import ua.trainings.utils.Utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexController {

    public String input(Scanner in, String regex){
        String input;
        while(true){
            if (in.hasNext()){
                if (Utils.checkNull(input = in.nextLine()) && checkRegex(regex, input)){
                    return input;
                }
            }
        }
    }

    public boolean checkRegex(String regex, String input){
        return Pattern.matches(regex, input);
    }

    public void addNote(View view, Notebook notebook, Scanner in){
        NoteBuilder builder = new NoteBuilder(notebook);
        String input;
        view.addNote();

        view.inputName();
        input = input(in, RegexConstants.NAME_REGEX);
        builder.setName(input + view.DOT);

        view.inputNickName();
        input = input(in, RegexConstants.NICKNAME_REGEX);
        builder.setNickame(input);

        view.inputMobilePhone();
        input = input(in, RegexConstants.MOBILEPHONE_REGEX);
        builder.setMobilePhone(input);

        view.inputHomePhone();
        input = input(in, RegexConstants.HOMEPHONE_REGEX);
        builder.setHomePhone(input);

        view.inputEmail();
        input = input(in, RegexConstants.EMAIL_REGEX);
        builder.setEmail(input);

        view.thanksForNewNote();
        notebook.addNote(builder.getNote());
    }
}
