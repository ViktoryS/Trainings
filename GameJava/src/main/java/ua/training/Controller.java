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
        model.generateRandomValue();
        view.welcomeMsg();
        int res = -1;
        while(res != model.getRandomValue()){
            changeBariers(res = inputIntWithScanner(in));
            model.addResultValue(model.getMinBarrier() + view.SPASE_MSG
                    + view.TWO_DOTS_MSG + view.SPASE_MSG + model.getMaxBarrier());
        }
        view.congradulationMsg();
        view.printResultArray(model.getResultValues());
    }

    public int inputIntWithScanner(Scanner in){
        int res = -1;
        view.inputValueWithBarriers(model);

        while( true ) {
            while (!in.hasNextInt()) {
                view.wrongInputMsg();
                view.inputIntMsg();
                in.next();
            }
            if ((res = in.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.wrongInputMsg();
                view.inputIntMsg();
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
}
