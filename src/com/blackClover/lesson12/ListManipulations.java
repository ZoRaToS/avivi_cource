package com.blackClover.lesson12;

import java.util.Collections;
import java.util.List;

public class ListManipulations {
    /**
     * Заповнення списку та виведення на екран
     * @param integers
     */
    public void createList(List<Integer> integers) {
        while (integers.size() < 10) {
            integers.add((int) (1 + Math.random() * 10));
        }
        System.out.println("List with integers: ");
        for (Integer number : integers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }

    /**
     * Заповнення другого списку кожним другим подвійним числом із попереднього списку та виведення на екран
     * @param integers
     * @param doubledInts
     */
    public void moveToList(List<Integer> integers, List<Integer> doubledInts) {
        System.out.println("List with doubled integers");
        for (int i = 1; i < integers.size(); i += 2) {
            doubledInts.add(integers.get(i) * 2);
        }
        for (Integer number : doubledInts) {
            System.out.print(number + "\t");
        }
        System.out.println();
        System.out.println("List with doubled integers reverse output");
        Collections.reverse(doubledInts);
        for (Integer number : doubledInts) {
            System.out.print(number + "\t");
        }
    }

}
