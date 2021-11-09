package org.example;

public class CarFactory {

    VehicleRegistrationNumberGenerator generator = new VehicleRegistrationNumberGenerator();

    private String brand;

    public CarFactory(String brand) {
        this.brand = brand;
    }

    public Car createNewCar(String color){

        Car car = new Car(color, this.brand, generator.nextVehicleRegistrationNumber());

        return car;
    }


}
