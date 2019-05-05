package com.blackClover.lesson7;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // створення "робітника" з погодинною ставкою
        WorkerHourlyWage workerHourlyWage = new WorkerHourlyWage();

        System.out.print("Введіть розмір погодинної ставки: ");
        workerHourlyWage.setSalaryPerHour(scn.nextDouble());

        System.out.print("Введіть кількість відпацьованих годин: ");
        workerHourlyWage.setHoursWorked(scn.nextInt());
        // Виклик метода для підрахунку заробітної плати
        workerHourlyWage.salary(workerHourlyWage.getHoursWorked(), workerHourlyWage.getSalaryPerHour());
        System.out.println();
       // Створення "робітника" з щомісячною ставкою
        WorkerMonthlyRate workerMonthlyRate = new WorkerMonthlyRate();

        System.out.print("Введіть розмір щомісячної ставки ставки: ");
        workerMonthlyRate.setMonthlyRate(scn.nextInt());

        System.out.print("Введіть кількість відпацьованих днів: ");
        workerMonthlyRate.setWorkedDays(scn.nextInt());
         // Виклик метода для підрахунку заробітної плати
        workerMonthlyRate.salary(workerMonthlyRate.getWorkedDays(), workerMonthlyRate.getMonthlyRate());
    }
}

