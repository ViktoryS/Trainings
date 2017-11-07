package ua.training;

import java.util.Scanner;

import static ua.training.View.*;

public class Controller {
    private static final String HELLO_STR = "Hello,";
    private static final String WORLD_STR = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void proccessUser(){
        view.printMessage(WELCOME_MESSAGE);
        Scanner in = new Scanner(System.in);
        inputDataWithScanner(in, HELLO_STR);
        inputDataWithScanner(in, WORLD_STR);
        view.printMessage(BEFORE_PRINT_MODEL +
                            "\n" + model.getData() +
                            "\n" + FINAL_MESSAGE);
    }

    public void inputDataWithScanner(Scanner in, String str){
        String inputData = in.next();
        while (!equalsInputStr(inputData,str)){
            view.printMessage(WRONG_DATA_MESSAGE);
            inputData = in.next();
        }
        model.addStrToExistingData(str);
    }

    public boolean equalsInputStr(String input, String str){
        return input.equals(str);
    }
}
