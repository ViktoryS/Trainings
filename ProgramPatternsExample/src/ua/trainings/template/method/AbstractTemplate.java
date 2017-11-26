package ua.trainings.template.method;

public abstract class AbstractTemplate {
    public void method(){
        System.out.print(1);
        template();
        System.out.println(3);
    }

    public abstract void template();
}
