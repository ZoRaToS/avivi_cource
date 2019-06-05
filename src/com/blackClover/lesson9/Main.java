package com.blackClover.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Написати програму для роботи з Enums. (Даємо волю фантазії. )" +
                " Це може бути Опис ІТ компаній і їх спеціалізації. Універ і його факультети і т.д.\n" +
                "2. Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним." +
                " Якщо користувач введе не ціла число, то повідомляти йому про помилку\n" +
                "3. Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел," +
                " введених користувачем. Якщо користувач некоректно введе хоча б одне з чисел," +
                " то повідомляти про помилку.\n" + "Введіть номер завдання: ");
        int numberOfTask = getNextIntegerNumber(scanner);

        switch (numberOfTask) {
            case 1:

                break;
            case 2:
                System.out.print("Введіть число з клавіатури: ");
                int checkNumber = getNextIntegerNumber(scanner);
                checkNumers(checkNumber);
                System.out.println();
                break;
            case 3:
                System.out.print("Введіть перше число: ");
                int firstNumber = getNextIntegerNumber(scanner);
                System.out.print("Введіть друге число: ");
                int secondNumber = getNextIntegerNumber(scanner);
                System.out.println("Сума чисел дорівнює: " + sumOfNumbers(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Такого завдання не існує");
        }
    }

    /**
     * перевірка правильності введення данних
     *
     * @param scannerInt
     * @return
     */
    private static int getNextIntegerNumber(Scanner scannerInt) {
        while (!scannerInt.hasNextInt()) {
            System.out.println("ПОМИЛКА!!! Ви ввели не ціле число або символ. Повторіть будь-ласка введення: ");
            scannerInt.next();
        }
        return scannerInt.nextInt();
    }

    private static MovementType detectMovementType(String input) {
        if ("AIR".equals(input.toUpperCase())) {
            return MovementType.AIR;
        }
        return null;
    }

    /**
     * Перевірка на парність\непарність
     */
    private static void checkNumers(int checkNumber) {
        if (checkNumber % 2 == 0) {
            System.out.println("Число " + checkNumber + " - парне");
        } else {
            System.out.println("Число " + checkNumber + " - не парне");
        }
    }

    /**
     * Cума двох чисел
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    private static int sumOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
