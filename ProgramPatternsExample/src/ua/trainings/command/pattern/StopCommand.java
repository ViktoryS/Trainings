package ua.trainings.command.pattern;

public class StopCommand extends AbstractCommand{
    public StopCommand (Computer computer){
        super(computer);
    }

    public void excecute(){
        computer.stop();
    }
}
