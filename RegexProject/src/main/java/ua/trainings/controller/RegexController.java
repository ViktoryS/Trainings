package ua.trainings.controller;

import ua.trainings.utils.Utils;
import ua.trainings.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexController {

    public String input(Scanner in, String message, String regex, View view){
        String input;
        while(true){
            view.inputValue(message);
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
