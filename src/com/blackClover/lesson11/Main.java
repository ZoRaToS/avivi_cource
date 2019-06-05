package com.blackClover.lesson11;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello Java", 8);
        System.out.println(pair.toString());//вивід через toString()
        System.out.println(pair.getValueL() + pair.getValueR());//вивід через гетери
        System.out.println();
        Triple<Double, Integer, String> triple = new Triple(5.0, 12, "Triple");
        System.out.println(triple.getValueTripleL() + triple.getValueTripleM() + triple.getValuetripleR());
        System.out.println(triple.toString());

        System.out.println();
        /**
         * Друге завдання Домашки
         */
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(7);

        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.checkForExistance(linkedList, 0);
    }
}
