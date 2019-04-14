package com.blackClover.lesson1;

public class HomeWork {
    public static void main(String[] args) {
        /**
         * Task №1
         */
        byte bite;
        short sh;
        int integer;
        long longest;
        float fl;
        double dbl;
        boolean bln;
        char character;

        HomeWork homeWork = new HomeWork();
        homeWork.maxMinOfTypeValues();
        homeWork.draw();
    }

    /**
     * Task №2
     */
    public void maxMinOfTypeValues() {
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Minimal value of Byte is: " + minByte);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Maximum value of Byte is: " + maxByte);
        short minShort = Short.MIN_VALUE;
        System.out.println("Minimal value of Short is: " + minShort);
        short maxShort = Short.MAX_VALUE;
        System.out.println("Maximum value of Short is: " + maxShort);
        int minInteger = Integer.MIN_VALUE;
        System.out.println("Minimal value of Integer is: " + minInteger);
        int maxInteger = Integer.MAX_VALUE;
        System.out.println("Maximum value of Integer is: " + maxInteger);
        long minLong = Long.MIN_VALUE;
        System.out.println("Minimal value of Long is:" + minLong);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Maximum value of Long is:" + maxLong);
        float minFloat = Float.MIN_VALUE;
        System.out.println("Minimal value of Float is:" + minFloat);
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Maximum value of Float is:" + maxFloat);
        double minDouble = Double.MIN_VALUE;
        System.out.println("Minimal value of Double is:" + minDouble);
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Minimal value of Double is:" + maxDouble);
        char minCharacter = Character.MIN_VALUE;
        System.out.println("Minimal value of Character is:" + minCharacter);
        char maxCharacter = Character.MAX_VALUE;
        System.out.println("Minimal value of Character is:" + maxCharacter);
    }
    /**
     * Task №3
     */
    public void draw(){
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("   *******   ");
        System.out.println("  *       *   ");
        System.out.println(" *         *   ");
        System.out.println("  *       *   ");
        System.out.println("   *******   ");
    }
}
