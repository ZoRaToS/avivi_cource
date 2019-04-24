package com.blackClover.lesson5;

public class Main {
    public static void main(String[] args) {
        //Обьект класа Robot
        Robot robot = new Robot();
        robot.work();
        //Обьект класа CoffeRobot
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();
        //Обьект класа RobotDancer
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        //Обьект класа RobotCooker
        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();
    }
}
