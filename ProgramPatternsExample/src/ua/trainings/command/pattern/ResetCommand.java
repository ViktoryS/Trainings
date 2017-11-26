package ua.trainings.command.pattern;

public class ResetCommand extends AbstractCommand{
    public ResetCommand (Computer computer){
        super(computer);
    }

    public void excecute(){
        computer.reset();
    }
}
