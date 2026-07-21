package com.automobile.Fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int currentSpeed;

    public Ford(String modelName, String registrationNumber, String ownerName, int currentSpeed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    // Required Assignment Method
    public int speed() {
        return currentSpeed;
    }

    // Required Assignment Method
    public int tempControl() {
        System.out.println("Air conditioning temperature control has been adjusted.");
        return 1; // Returns status code (e.g., 1 for ON)
    }
}