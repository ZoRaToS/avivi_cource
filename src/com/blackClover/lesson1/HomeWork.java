package com.blackClover.lesson1;

public class HomeWork {
    public static void main(String[] args) {
        /**
         * Task №1
         */
        byte byteVar = 1;
        short shortVar = 34;
        int integerVar = 12_03_1994;
        long longVar = 245L;
        float floatVar = 4.5f;
        double doubleVar = 7.4D;
        boolean booleanVar = false;
        char character = 'D';


        maxMinOfTypeValues();
        draw();
    }

    /**
     * Task №2
     */
    public static void maxMinOfTypeValues() {
        System.out.println("Minimal value of Byte is: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of Byte is: " + Byte.MAX_VALUE);
        System.out.println("Minimal value of Short is: " + Short.MIN_VALUE);
        System.out.println("Maximum value of Short is: " + Short.MAX_VALUE);
        System.out.println("Minimal value of Integer is: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of Integer is: " + Integer.MAX_VALUE);
        System.out.println("Minimal value of Long is:" + Long.MIN_VALUE);
        System.out.println("Maximum value of Long is:" + Long.MAX_VALUE);
        System.out.println("Minimal value of Float is:" + Float.MIN_VALUE);
        System.out.println("Maximum value of Float is:" + Float.MAX_VALUE);
        System.out.println("Minimal value of Double is:" + Double.MIN_VALUE);
        System.out.println("Minimal value of Double is:" + Double.MAX_VALUE);
        System.out.println("Minimal value of Character is:" + Character.MIN_VALUE);
        System.out.println("Minimal value of Character is:" + Character.MAX_VALUE);
    }

    /**
     * Task №3
     */
    public static void draw() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println();
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println();
        System.out.println("   *******   ");
        System.out.println("  *       *   ");
        System.out.println(" *         *   ");
        System.out.println("  *       *   ");
        System.out.println("   *******   ");
    }
}
