package ua.training.count.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListInitializer {
    private static List<Integer> list;
    static {
        list = new ArrayList<>();
    }

    public static List<Integer> initWithRandom(int size, int max){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max));
        }
        return list;
    }

    public static List<Integer> initManually(int size, Scanner scanner){
        for (int i = 0; i < size; i++) {
            list.add(inputIntWithScanner(scanner));
        }
        return list;
    }

    private static int inputIntWithScanner(Scanner scanner){
        while(true){
            while (!scanner.hasNextInt()){
                System.out.println("Wrong value, try more:");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }

}
