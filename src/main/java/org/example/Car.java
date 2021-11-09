package org.example;

public class Car {

    String color;
    String brand;
    String regNo;
    String model;



    public Car(String color, String brand, String regNo, String model) {
        this.color = color;
        this.brand = brand;
        this.regNo = regNo;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getmodel() {

        return model;
    }
}
