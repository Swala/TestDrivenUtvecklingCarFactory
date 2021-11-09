package org.example;


import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    VehicleRegistrationNumberGenerator generator = new VehicleRegistrationNumberGenerator();

    private String brand;
    private List<Model> modelList = new ArrayList<>();


    public CarFactory(String brand) {
        this.brand = brand;
        setModelList();

    }


    public Car createNewCar(String color, String model){
        /*
        return switch (model) {
            case "900" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 90, 4);
            case "900 Turbo" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 150, 4);
            case "93" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 110, 4);
            case "93 aero" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 190, 4);
            case "9-7X" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Diesel", 170, 6);
            default -> throw new RuntimeException("Unknown model " + model);
        };*/

        Car car = new Car(color, this.brand, generator.nextVehicleRegistrationNumber(),
                getModelList().get(0).model,
                getModelList().get(0).engine,
                getModelList().get(0).enginePower,
                getModelList().get(0).seats);

        return  car;

    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList() {
        this.modelList.add(new Model("900", "Gasoline", 90, 4));
        this.modelList.add(new Model("900 Turbo", "Gasoline", 150, 4));
        this.modelList.add(new Model("93", "Gasoline", 110, 4));
        this.modelList.add(new Model("93 aero", "Gasoline", 190, 4));
        this.modelList.add(new Model("9-7X", "Diesel", 170, 6));
    }


}


