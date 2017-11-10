package ua.trainings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String s = in.nextLine();
            System.out.println(s);
            if (Pattern.matches("^([A-za-z]+)((\\.|\\+)?\\w+)*@[a-z]+(\\.\\w+)?\\.(ua|com|net|ru)$",s)) {
                System.out.println("ok!!!");
            } else System.out.println("NO!!!!!!!!!");

        }
    }
}
