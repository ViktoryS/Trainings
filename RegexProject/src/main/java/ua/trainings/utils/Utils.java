package ua.trainings.utils;

public interface Utils {
    static boolean checkNull(String s){
        if(!(s == null)){
            if(s.equals("") || s.equals(" ")) {
                return true;
            } else
                return false;
        }
        return true;
    }
}
