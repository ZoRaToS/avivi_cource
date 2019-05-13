package com.blackClover.lesson4;

public class Triangle {
    private double height;
    private double weight;
    private double length;

    public Triangle() {
        System.out.println("Конструктор без параматрів");
    }

    public Triangle(double height, double weight, double length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }


    public double perimeter() {
        return weight + length + height;
    }

    public double square() {
        return (length * height) / 2;
    }
}
