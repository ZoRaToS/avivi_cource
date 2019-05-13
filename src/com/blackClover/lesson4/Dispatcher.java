package com.blackClover.lesson4;

public class Dispatcher {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.5, 4.3, 7.9);
        Triangle triangle2  = new Triangle();
        System.out.println("Площа трикутника: " + triangle.square());
        System.out.println("Периметр трикутника: " + triangle.perimeter());
    }
}
