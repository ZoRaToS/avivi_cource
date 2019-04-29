package com.blackClover.lesson6;

public class Dispatcher {
    public static void main(String[] args) {
        // Cow object
        Pet cow = new Cow();
        cow.voice();
        //Cat object
        Pet cat = new Cat();
        cat.voice();
        //Dog object
        Pet dog = new Dog();
        dog.voice();
    }
}
