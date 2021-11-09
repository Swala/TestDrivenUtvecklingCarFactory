package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    VehicleRegistrationNumberGenerator generator = new VehicleRegistrationNumberGenerator();

    private String brand;


    public CarFactory(String brand) {
        this.brand = brand;

    }

    public Car createNewCar(String color){

        Car car = new Car(color, this.brand, generator.nextVehicleRegistrationNumber(), "900");

        return car;
    }


}
