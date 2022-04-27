package com.mariuszkucinski.carapi.service;

import com.mariuszkucinski.carapi.entity.Car;

import java.util.List;

public interface CarService {
    Car findCarById(int id);
    List<Car> getAllCars();
    void deleteCarById(int id);
    void addCar(Car car);
    void editCar(Car car);
}
