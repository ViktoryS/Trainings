package ua.trainings.chain.responsibility.logger;

public class FileLogger extends Logger{

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Writing on file: " + message);
    }
}
