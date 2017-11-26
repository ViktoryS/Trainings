package ua.trainings.chain.responsibility.logger;

public abstract class Logger {
    private int priority;

    public Logger(int priority) {
        this.priority = priority;
    }

    private Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level) {
        if(level <= priority){
            write(message);
        }
        if(next != null){
            next.writeMessage(message, level);
        }
    }

    public abstract void write(String message);
}
