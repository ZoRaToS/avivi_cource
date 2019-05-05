package com.blackClover.lesson7;

public class WorkerHourlyWage implements Salary {
    private double salaryPerHour;
    private int hoursWorked;


    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        if (salaryPerHour > 0) {
            this.salaryPerHour = salaryPerHour;
        } else System.out.println("Зарплата не може бути від'ємною");
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked > 0 && hoursWorked <= 200 ) {
            this.hoursWorked = hoursWorked;
        } else System.out.println("Кількість не може бути від'ємною i більшою за 200");
    }

    @Override
    public void salary(int workedTime, double salary) {
        double totalSalary = workedTime * salary;
        System.out.println("Підскумкова зарплата за " + workedTime + " відрацьованих годин складає " + totalSalary + "$");
    }
}
