package com.mariuszkucinski.carapi.serviceimpl;

import com.mariuszkucinski.carapi.entity.Car;
import com.mariuszkucinski.carapi.repository.CarRepository;
import com.mariuszkucinski.carapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }


    @Override
    public Car findCarById(int id) {
        return carRepository.getById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void deleteCarById(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void editCar(Car car) {
        carRepository.save(car);
    }
}
