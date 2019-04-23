package com.blackClover.lesson3;

public class HomeWork {
    int[] array = new int[10];

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        homeWork.sortBublle();
    }

    public void sortBublle() {

        /**
         * Intitialization array
         */

        System.out.print("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        /**
         * Sort array with "Bubble"
         */

        System.out.print("Sorted array up:  ");
        int buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
            System.out.print(array[i] + "  ");
        }
    }
}

