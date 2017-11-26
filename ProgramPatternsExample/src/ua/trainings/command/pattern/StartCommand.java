package ua.trainings.command.pattern;

public class StartCommand extends AbstractCommand{
    public StartCommand(Computer computer){
        super(computer);
    }

    public void excecute(){
        computer.start();
    }
}
