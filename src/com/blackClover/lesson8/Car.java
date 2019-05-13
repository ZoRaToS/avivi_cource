package com.blackClover.lesson8;

public class Car {

    private String model;
    private double weight;
    private int maxSpeed;

    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private Body body;

    public Car(String model, double weight, int maxSpeed, double steeringWheelSize, double wheelSize, String typeBody) {
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.steeringWheel = new SteeringWheel(steeringWheelSize);
        this.wheel = new Wheel(wheelSize);
        this.body = new Body(typeBody);
    }

    public void drive() {
        System.out.println("Характеристики автомобіля:\n" +
                "Модель: " + model + "\n" + "Вага: " + weight + " кг \n" + "Максимальна швидкість: " + maxSpeed +
                " км/ч\n" + "Розмір керма " + steeringWheel.getSteeringWheelSize() + " дюймів\n" + "Розмір колес: "
                + wheel.getWheelSize() + " дюймів\n" + "Тип кузова: " + body.getTypeBody());
    }
}
