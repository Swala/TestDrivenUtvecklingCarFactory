package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {

    CarFactory carFactory;
    Car car;

    @BeforeEach
    void setUp(){
        carFactory = new CarFactory("Saab");
        car = carFactory.createNewCar("Red", 2);

    }

    @Test
    void test_create_car_success(){

        assertNotNull(car);
        assertEquals("Red", car.getColor());
        assertEquals("Saab", car.getBrand());
        assertEquals("ABC123", car.getRegNo());

    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "900, Gasoline, 90, 4",
            "900 Turbo, Gasoline, 150, 4",
            "93, Gasoline, 110, 4",
            "93 aero, Gasoline, 190, 4",
            "9-7X, Diesel, 170, 6"
    })
    void test_add_model_success(String model, String engine, Integer enginePower, Integer seats){

        assertEquals(model, car.getModel());
        assertEquals(engine, car.getEngine());
        assertEquals(enginePower, car.getEnginePower());
        assertEquals(seats, car.getSeats());
    }

    @Test
    void test_check_equipment_on_car_success(){
        List<String> equipment  = Arrays.asList("Xenon lights", "Light metal caps 24in", "Backseat Heating");
        assertEquals(equipment, car.getEquipmentList());
    }



}
