package com.automobile.Fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int currentSpeed;

    public Logan(String modelName, String registrationNumber, String ownerName, int currentSpeed) {
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
    public int gps() {
        System.out.println("GPS system has been activated and is operating.");
        return 1; // Returns status code (e.g., 1 for ON)
    }
}