package ua.trainings;

import ua.trainings.chain.responsibility.atm.CurrensyRating;
import ua.trainings.chain.responsibility.atm.NoteModule;
import ua.trainings.chain.responsibility.logger.*;
import ua.trainings.command.pattern.*;
import ua.trainings.facade.Authorizator;
import ua.trainings.facade.DB;
import ua.trainings.memento.FormSaver;
import ua.trainings.memento.OrderForm;
import ua.trainings.template.method.AbstractTemplate;
import ua.trainings.template.method.ConcretteOperation;
import ua.trainings.template.method.ConcretteOperation2;

public class Main {

    public static void main(String[] args) {
        //commandPattern();
        //templateMethod();
        //responsibilityLoggerTemplate();
        //responsibilityATMPattern();
        //mementoForm();
        facade();
    }

    public static void commandPattern(){
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer),
                new StopCommand(computer), new ResetCommand(computer));
        user.computerStart();
        user.computerStop();
        user.computerReset();
    }

    public static void templateMethod(){
        AbstractTemplate template = new ConcretteOperation();
        template.method();
        AbstractTemplate template2 = new ConcretteOperation2();
        template2.method();
    }

    public static void responsibilityLoggerTemplate(){
        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        smsLogger.setNext(fileLogger);
        Logger emailLogger = new EmailLogger(Level.INFO);
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("Hello log", Level.INFO);
        smsLogger.writeMessage("System error", Level.ERROR);
    }

    public static void responsibilityATMPattern(){
        NoteModule noteModule500 = new NoteModule(CurrensyRating.N_500);
        NoteModule noteModule200 = new NoteModule(CurrensyRating.N_200);
        noteModule500.setNext(noteModule200);
        NoteModule noteModule100 = new NoteModule(CurrensyRating.N_100);
        noteModule200.setNext(noteModule100);
        NoteModule noteModule50 = new NoteModule(CurrensyRating.N_50);
        noteModule100.setNext(noteModule50);
        NoteModule noteModule20 = new NoteModule(CurrensyRating.N_20);
        noteModule50.setNext(noteModule20);
        NoteModule noteModule10 = new NoteModule(CurrensyRating.N_10);
        noteModule20.setNext(noteModule10);
        NoteModule noteModule5 = new NoteModule(CurrensyRating.N_5);
        noteModule10.setNext(noteModule5);
        NoteModule noteModule1 = new NoteModule(CurrensyRating.N_1);
        noteModule5.setNext(noteModule1);
        noteModule500.operate(521);
    }

    public static void mementoForm(){
        OrderForm orderForm = new OrderForm();
        orderForm.setProductName("blue bag");
        orderForm.setCount(1);
        System.out.println(orderForm);

        FormSaver saver = new FormSaver();
        saver.setFormSender(orderForm.send());

        orderForm.setProductName("red bag");
        System.out.println(orderForm);

        System.out.println("UNDO...");
        orderForm.undo(saver.getFormSender());
        System.out.println(orderForm);
    }

    public static void facade(){
        Authorizator authorizator = new Authorizator(new DB());
        System.out.println(authorizator.authorizate("Vasya", "1111")?"user is authorizate!":"No such user!");
    }
}
