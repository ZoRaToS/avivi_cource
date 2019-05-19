package com.blackClover.lesson9;

public enum MovementType {

    AIR("Повітрям"), SEA("Морем"), LAND("Сушею");

    private final String movementType;

    MovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

}
