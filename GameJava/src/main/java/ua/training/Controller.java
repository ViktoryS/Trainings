package ua.training;

import java.util.Scanner;

public class Controller {

    private ua.training.Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void proccessUser(){
        Scanner in = new Scanner(System.in);
        model.setRandomValue(rand(GlobalConstants.MIN_BUNDLE, GlobalConstants.MAX_BUNDLE));
        view.printMessage(view.WELCOME_MSG);
        int res = -1;
        while(res != model.getRandomValue()){
            changeBariers(res = inputIntWithScanner(in));
            model.addResultValue(model.getMinBarrier() + view.TO_MSG + model.getMaxBarrier());
        }
        view.printMessage(view.CONGRADULATION_MSG);
        view.printResultArray(model.getResultValues());
    }

    public int inputIntWithScanner(Scanner in){
        int res = -1;
        view.printMessage(view.INPUT_FROM_MSG +
                model.getMinBarrier() + view.TO_MSG + model.getMaxBarrier() + view.TWO_DOTS_MSG);

        while( true ) {
            while (!in.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_MSG
                        + view.INPUT_INT_MSG);
                in.next();
            }
            if ((res = in.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_INPUT_MSG
                        + view.INPUT_INT_MSG);
                continue ;
            }
            break;
        }
        return res;
    }

    public void changeBariers(int value){
        if(model.getRandomValue() - value > value - model.getRandomValue()){
            model.setMinBarrier(value);
        }else{
            model.setMaxBarrier(value);
        }
    }

    public int rand(int min, int max){
        return (int)Math.round(Math.random() * (max-1) + min);
    }
}
