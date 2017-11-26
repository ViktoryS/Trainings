package ua.trainings.command.pattern;

public class User {
    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset){
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void computerStart(){
        start.excecute();
    }

    public void computerStop(){
        stop.excecute();
    }

    public void computerReset(){
        reset.excecute();
    }
}
