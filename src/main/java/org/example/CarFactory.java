package org.example;

public class CarFactory {

    private Car car;


    public Car createNewCar(String color){
        Car car = new Car(color);

        return car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
