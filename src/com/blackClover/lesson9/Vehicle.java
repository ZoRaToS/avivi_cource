package com.blackClover.lesson9;

public enum Vehicle {
    BIKE("Байк"), CAR("Автомобіль"), BUS("Автобус"),
    BALLOON("Повітряна куля"), AIRSHIP("Дирижабль"),
    PLANE("Літак"), BOAT("Човен"), SHIP("Корабель"),
    LINER("Лайнер");

    private final String transportType;

    Vehicle(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }

    public static Vehicle chooseTransportType(String transportType) {
        for (Vehicle vehicle : Vehicle.values()) {
            if (vehicle.transportType.equals(transportType)) {
                return vehicle;
            }
        }
        return null;
    }
}
