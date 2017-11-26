package ua.trainings.chain.responsibility.logger;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email writing: " + message);
    }
}
