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
                transportOrganization(scanner);
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

    private static void transportOrganization(Scanner scanner) throws IllegalArgumentException {
        TransportOrganiztaion transOrg = new TransportOrganiztaion();
        System.out.println("Оберіть спосіб пересування із вказаних: AIR, SEA, LAND");
        String selectMovement = scanner.next();
        String selectTransport;

//        if (MovementType.valueOf(selectMovement) == MovementType.AIR) {
//            transOrg.setMovementType(MovementType.valueOf(selectMovement));
//            System.out.println("Обрано пересування" + transOrg.getMovementType().getMovementType() +
//                    "Оберіть транспорт із вказаних: BALLOON, AIRSHIP, PLAN");
//            selectTransport = scanner.next();
//
//            switch (selectTransport) {
//                case "BALLOON":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "AIRSHIP":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "PLANE":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                default:
//                    System.out.println("Такого транспорту немає на даний момент");
//            }
//        } else {
//            System.out.println("Такого способу пересування не існує");
//        }
//
//        if (MovementType.valueOf(selectMovement) == MovementType.SEA) {
//            transOrg.setMovementType(MovementType.valueOf(selectMovement));
//            System.out.println("Обрано пересування" + transOrg.getMovementType().getMovementType() +
//                    "Оберіть транспорт із вказаних: BOAT, SHIP, LINER");
//            selectTransport = scanner.next();
//
//            switch (selectTransport) {
//                case "BOAT":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "SHIP":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "LINER":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                default:
//                    System.out.println("Такого транспорту немає на даний момент");
//            }
//        } else {
//            System.out.println("Такого способу пересування не існує");
//        }
//        if (MovementType.valueOf(selectMovement) == MovementType.LAND) {
//            transOrg.setMovementType(MovementType.valueOf(selectMovement));
//            System.out.println("Обрано пересування" + transOrg.getMovementType().getMovementType() +
//                    "Оберіть транспорт із вказаних: BIKE, CAR, BUS");
//            selectTransport = scanner.next();
//
//            switch (selectTransport) {
//                case "BIKE":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "CAR":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                case "BUS":
//                    transOrg.setVehicle(Vehicle.valueOf(selectTransport));
//                    System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
//                    break;
//                default:
//                    System.out.println("Такого транспорту немає на даний момент");
//            }
//        } else {
//            System.out.println("Такого способу пересування не існує");
//        }
        switch (selectMovement) {
            case "AIR":
                transOrg.setMovementType(MovementType.valueOf(selectMovement));
                System.out.println("Обрано пересування " + transOrg.getMovementType().getMovementType() +
                        ". Оберіть транспорт із вказаних: BALLOON, AIRSHIP, PLAN");
                selectTransport = scanner.next();
                transOrg.setVehicle(Vehicle.valueOf(selectTransport));
                System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
                break;
            case "SEA":
                transOrg.setMovementType(MovementType.valueOf(selectMovement));
                System.out.println("Обрано пересування " + transOrg.getMovementType().getMovementType() +
                        ". Оберіть транспорт із вказаних: BOAT, SHIP, LINER");
                selectTransport = scanner.next();
                transOrg.setVehicle(Vehicle.valueOf(selectTransport));
                System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
                break;
            case "LAND":
                transOrg.setMovementType(MovementType.valueOf(selectMovement));
                System.out.println("Обрано пересування " + transOrg.getMovementType().getMovementType() +
                        ". Оберіть транспорт із вказаних: BIKE, CAR, BUS");
                selectTransport = scanner.next();
                transOrg.setVehicle(Vehicle.valueOf(selectTransport));
                System.out.println("Обрано " + transOrg.getVehicle().getTransportType() + ". Щасливої дороги");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selectMovement);
            }

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
