package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {

    CarFactory carFactory;
    String model;

    @BeforeEach
    void setUp(){
        carFactory = new CarFactory("Saab");

    }

    @Test
    void test_create_car_success(){

        Car car = carFactory.createNewCar("Red", model="900");

        assertNotNull(car);

        assertEquals("Red", car.getColor());
        assertEquals("Saab", car.getBrand());
        //assertEquals("ABC123", car.getRegNo());

    }

    @ParameterizedTest
    @CsvSource({
            "900, Gasoline, 90, 4",
            "900 Turbo, Gasoline, 150, 4",
            "93, Gasoline, 110, 4",
            "93 aero, Gasoline, 190, 4",
            "9-7X, Diesel, 170, 6"
    })
    void test_add_model_success(String model, String engine, Integer enginePower, Integer seats){
        CarFactory carFactory = new CarFactory("Saab");
        Car car = carFactory.createNewCar("Red", model);

        assertEquals(model, car.getModel());
        assertEquals(engine, car.getEngine());
        assertEquals(enginePower, car.getEnginePower());
        assertEquals(seats, car.getSeats());
    }

}
