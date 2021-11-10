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

    public Car createNewCar(String color, int modelIndex){
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
                getModelList().get(modelIndex).model,
                getModelList().get(modelIndex).engine,
                getModelList().get(modelIndex).enginePower,
                getModelList().get(modelIndex).seats);

        /*Car car = new Car(color, this.brand, generator.nextVehicleRegistrationNumber(),
                newModel.model, newModel.engine, newModel.enginePower, newModel.seats);*/

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

    //or a create Model method?
    public Model createModel(String model, String engine, Integer enginePower, Integer seats){
        Model newModel = new Model(model, engine, enginePower, seats);

        return newModel;

    }


}


