package com.blackClover.lesson9;

public enum MovementType {

    AIR("Повітрям"), SEA("Морем"), LAND("Сушею");

    private final String typeOfMovement;

    MovementType(String movementType) {
        this.typeOfMovement = movementType;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public static MovementType chooseMovementType(String typeOfMovement) {
        for (MovementType moveType : MovementType.values()) {
            if(moveType.typeOfMovement.equals(typeOfMovement)){
                return moveType;
            }
        }
        return null;
    }

}
