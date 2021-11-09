package org.example;

public class Model {

    String model;
    String engine;
    Integer enginePower;
    Integer seats;

    public Model(String model, String engine, Integer enginePower, Integer seats) {
        this.model = model;
        this.engine = engine;
        this.enginePower = enginePower;
        this.seats = seats;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }


}
