package ua.training;

import ua.training.own.collection.OwnList;

public class Main {
    public static void main(String[] args) {
        OwnList<Integer> myList = new OwnList<>(20);
        for (int i = 0; i < 50; i++) {
            myList.add(i+5);
        }
        OwnList<Integer> myList1  = new OwnList<>();
        myList1.addAll(myList);
        System.out.println(myList1);
    }
}
