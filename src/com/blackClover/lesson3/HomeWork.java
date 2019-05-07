package com.blackClover.lesson3;

public class HomeWork {


    public static void main(String[] args) {
        sortBublle();
    }

    public static void sortBublle() {

        /**
         * Intitialization array
         */
        int[] array = new int[10];
        System.out.print("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        /**
         * Sort array with "Bubble"
         */

        System.out.print("Sorted array up: ");
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
        System.out.println();

        System.out.print("Sorted array down: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
            System.out.print(array[i] + "  ");
        }
    }
}

