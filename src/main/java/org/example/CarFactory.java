package org.example;

public class CarFactory {

    private Car car;
    private String brand;


    public CarFactory(String brand) {
        this.brand = brand;
    }

    public Car createNewCar(String color){
        car = new Car(color, brand);

        return car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
