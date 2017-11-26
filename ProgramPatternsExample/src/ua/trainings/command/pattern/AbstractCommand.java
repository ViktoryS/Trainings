package ua.trainings.command.pattern;

abstract class AbstractCommand implements Command {
    protected Computer computer;

    protected AbstractCommand(Computer computer){
        this.computer = computer;
    }
}
