package ua.training;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public static final String TWO_DOTS_MSG = ":";
    public static final String SPASE_MSG = " ";

    private static final String MESSAGES_BUNDLE_NAME = "messages";
    private static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    private static final String WELCOME_MSG = "welcome.msg";
    private static final String INPUT_FROM_MSG = "input.from.msg";
    private static final String TO_MSG = "input.to.msg";
    private static final String WRONG_INPUT_MSG = "wrong.input";
    private static final String INPUT_INT_MSG = "input.int.msg";
    private static final String CONGRADULATION_MSG = "congradulations";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printResultArray(String[] array){
        for (String s :
                array) {
            System.out.println(s);
        }
    }

    public void welcomeMsg(){
        System.out.println(bundle.getString(WELCOME_MSG));
    }

    public void wrongInputMsg(){
        System.out.println(bundle.getString(WRONG_INPUT_MSG));
    }

    public void inputIntMsg(){
        System.out.println(bundle.getString(INPUT_INT_MSG));
    }

    public void inputValueWithBarriers(Model model){
        System.out.println(bundle.getString(INPUT_FROM_MSG) + SPASE_MSG
                + model.getMinBarrier() + SPASE_MSG + bundle.getString(TO_MSG)
                + SPASE_MSG + model.getMaxBarrier() + TWO_DOTS_MSG);
    }

    public void congradulationMsg(){
        System.out.println(bundle.getString(CONGRADULATION_MSG));
    }
}
