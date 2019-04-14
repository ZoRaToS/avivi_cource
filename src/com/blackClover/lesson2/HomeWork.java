package com.blackClover.lesson2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        HomeWork homeWork2 = new HomeWork();

        homeWork2.initArray();
        homeWork2.randomArray();
        homeWork2.daysOfWeek();
    }

    /**
     * Task №1
     */
    public void initArray() {
        int[] oddNumbers = new int[100];
        for (int i = 1; i < oddNumbers.length; i += 2) {
            oddNumbers[i] = i;
            System.out.print(oddNumbers[i] + "\t");
        }
        System.out.println();
        for (int i = oddNumbers.length - 1; i > 0; i -= 2) {
            oddNumbers[i] = i;
            System.out.print(oddNumbers[i] + "\t");
        }
        System.out.println();
        System.out.println();

    }



    /**
     * Task №2
     */
    public void randomArray() {
        int[] randArray = new int[8];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (1 + Math.random() * 10);
        }
        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < randArray.length; i++) {
            if (i % 2 != 0) {
                randArray[i] = 0;
            }
            System.out.print(randArray[i] + "\t");
        }
    }

    /**
     *Task №3
     */
    public void daysOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day's weekday: ");
        int numberDay = scanner.nextInt();
        switch (numberDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Such a day does not exist");
                    break;

        }
    }


}
