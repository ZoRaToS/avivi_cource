package com.blackClover.lesson7;

public class WorkerMonthlyRate implements Salary {

    private int monthlyRate; // щомічячна ставка
    static final int WORK_DAYS_IN_MONTH = 20; // фіксована кількість  робочих днів в місяць
    private int workedDays;// кількість відпрацьованих днів працівником

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        if (workedDays > 0 && workedDays <= 30) {
            this.workedDays = workedDays;
        } else System.out.println("Кількість не може бути від'ємною і більшою за 30");
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        if (monthlyRate > 0) {
            this.monthlyRate = monthlyRate;
        } else System.out.println("Зарплата не може бути від'ємною");
    }


    @Override
    public void salary(int workedTime, double salary) {
        double totalSalary = 0;
        if (workedTime < WORK_DAYS_IN_MONTH) {
            System.out.println("Відпрацьвано менше норми на: " + (WORK_DAYS_IN_MONTH - workedTime) + " днів");
            totalSalary = workedTime * (salary / WORK_DAYS_IN_MONTH);
            System.out.println("Підсумкова зарплата складає: " + totalSalary + "$");
        } else if (workedTime == WORK_DAYS_IN_MONTH) {
            System.out.println("Відпрацьовано норма ");
            totalSalary = salary;
            System.out.println("Підсумкова зарплата складає: " + totalSalary + "$");
        } else if (workedTime > WORK_DAYS_IN_MONTH) {
            System.out.println("Відпрацьвано більше норми на: " + (-1 * (WORK_DAYS_IN_MONTH - workedTime)) + " днів");
            totalSalary = salary + (salary / WORK_DAYS_IN_MONTH * 2 * (-1 * (WORK_DAYS_IN_MONTH - workedTime)));
            System.out.println("Підсумкова зарплата складає: " + totalSalary + "$");
        }
    }
}
