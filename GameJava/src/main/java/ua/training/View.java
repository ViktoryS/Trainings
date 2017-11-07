package ua.training;

public class View {
    public static final String WELCOME_MSG = "Hello, gamer! Are you ready? Computer already generated the digit!";
    public static final String INPUT_FROM_MSG = "Input your digit from ";
    public static final String TO_MSG = " to ";
    public static final String TWO_DOTS_MSG = ": ";
    public static final String WRONG_INPUT_MSG = "Your digit is wrong!";
    public static final String INPUT_INT_MSG = "Please, input digit: ";
    public static final String CONGRADULATION_MSG = "Congradulations! You're win with results:";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printResultArray(String[] array){
        for (String s :
                array) {
            System.out.println(s);
        }
    }
}
