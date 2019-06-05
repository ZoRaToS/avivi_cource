package com.blackClover.lesson9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TransportOrganiztaion {
    private MovementType movementType;
    private Vehicle vehicle;
    List<MovementType> movementTypeList = Arrays.asList(MovementType.values());


    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private void transportOrganization(Scanner scanner){
        String selectMovement = scanner.next();
        String selectTransport;
        MovementType.chooseMovementType(selectMovement);

    }
}
