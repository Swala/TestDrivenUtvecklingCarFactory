package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String color;
    private String brand;
    private String regNo;
    private String model;
    private String engine;
    private Integer enginePower;
    private Integer seats;

    private List<String> equipmentList = new ArrayList<>();

    //Model model;



    public Car(String color, String brand, String regNo, String model, String engine, Integer enginePower, Integer seats) {

        this.color = color;
        this.brand = brand;
        this.regNo = regNo;
        this.model = model;
        this.engine = engine;
        this.enginePower = enginePower;
        this.seats = seats;
        setEquipmentList();

    }

    public String getColor() {
        return color;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getBrand() {
        return brand;
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

    public void setEquipmentList(){
        this.equipmentList.add("Xenon lights");
        this.equipmentList.add("Light metal caps 24in");
        this.equipmentList.add("Backseat Heating");

    }

    public List<String> getEquipmentList(){
        return equipmentList;
    }
}
