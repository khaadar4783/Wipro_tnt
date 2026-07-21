package com.wipro.automobile.ship;

public class Compartment {
    // Attributes
    private double height;
    private double width;
    private double breadth;

    // Constructor
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Optional: Method to display compartment details
    public void displayDetails() {
        System.out.println("Ship Compartment Dimensions: " + height + " x " + width + " x " + breadth);
    }
}