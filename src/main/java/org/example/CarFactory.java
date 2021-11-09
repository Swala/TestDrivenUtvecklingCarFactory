package org.example;


public class CarFactory {

    VehicleRegistrationNumberGenerator generator = new VehicleRegistrationNumberGenerator();

    private String brand;


    public CarFactory(String brand) {
        this.brand = brand;

    }

    public Car createNewCar(String color, String model){

        return switch (model) {
            case "900" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 90, 4);
            case "900 Turbo" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 150, 4);
            case "93" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 110, 4);
            case "93 aero" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Gasoline", 190, 4);
            case "9-7X" -> new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model, "Diesel", 170, 6);
            default -> throw new RuntimeException("Unknown model " + model);
        };

        //Car car = new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), model);

    }


}
