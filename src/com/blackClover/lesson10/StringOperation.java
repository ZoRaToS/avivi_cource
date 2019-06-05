package com.blackClover.lesson10;


public class StringOperation {
    private String myString = "В падающем самолёте нет атеистов.";
    private String myString2 = "Під лежачій камінь вода не тече";

    public void stringOperation() {
        // розділення на масив символів
        System.out.println("Розділення на масив символів");
        char[] myChar = myString.toCharArray();
        for (char c : myChar) {
            System.out.print(c + "\t");
        }
        System.out.println();
        //Повернення символу строки по індексу
        System.out.println("Повернення символу строки по індексу");
        System.out.println(myString.charAt(5));
        System.out.println("Конкатенація з урахування розділювача");
        System.out.println(String.join(" ", myString, myString2));
    }

    public void palindrom() {
        String variable = "Я іду з мечем";
        String[] array = variable.split(" ");//розділяємо строку на масив строк
        StringBuffer rev;//поле для збереження реверсивного значення елементу масива array
        for (String s : array) {
            rev = new StringBuffer(s).reverse();
            String strRev = rev.toString();//перетворюємо знову в тип STRING
            if (s.equalsIgnoreCase(strRev)) {
                System.out.printf("В вашому рядку є паліндром '%s' ", s);
                System.out.println();
            }
        }
    }
}
