package org.example;

public class CarFactory {

    private Car car;


    public Car createNewCar(){
        //Car car = new Car();

        return car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
