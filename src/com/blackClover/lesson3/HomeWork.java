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

        System.out.print("Sorted array down:  ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        System.out.print("Sorted array up:  ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + "  ");
        }
    }
}

