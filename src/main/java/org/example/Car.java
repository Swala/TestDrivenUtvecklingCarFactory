package org.example;

public class Car {

    String color;
    String brand;
    String regNo;
    String model;
    String engine;
    Integer enginePower;
    Integer seats;


    public Car(String color, String brand, String regNo, String model, String engine, Integer enginePower, Integer seats) {
        this.color = color;
        this.brand = brand;
        this.regNo = regNo;
        this.model = model;
        this.engine = engine;
        this.enginePower = enginePower;
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegNo() {
        return regNo;
    }


    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Integer getSeats() {
        return seats;
    }
}
