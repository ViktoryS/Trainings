package ua.training;

public class View {
    public static final String WELCOME_MESSAGE = "Hello! Input something, please:";
    public static final String WRONG_DATA_MESSAGE = "Sorry, it's wrong data! Try again:";
    public static final String BEFORE_PRINT_MODEL = "Congradulations! Your model's data is:";
    public static final String FINAL_MESSAGE = "Thank for your attention! Goodbye!";

    public void printMessage(String message){
        System.out.println(message);
    }

}
