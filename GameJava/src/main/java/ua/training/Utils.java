package ua.training;

public interface Utils {

    static int rand(int min, int max){
        return (int)Math.round(Math.random() * (max-1) + min);
    }

}
