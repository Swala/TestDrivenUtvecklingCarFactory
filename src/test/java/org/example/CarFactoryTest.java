package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {


    @Test
    void test_create_car_success(){

        CarFactory carFactory = new CarFactory("Saab");
        Car car = carFactory.createNewCar("Red");

        assertNotNull(car);

        assertEquals("Red", car.getColor());
        assertEquals("Saab", car.getBrand());
        assertEquals("ABC123", car.getRegNo()); //how test a random string?

    }

}
