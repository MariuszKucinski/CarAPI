package com.mariuszkucinski.carapi.controller;

import com.mariuszkucinski.carapi.entity.Car;
import com.mariuszkucinski.carapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mariuszkucinski.carapi.serviceimpl.CarServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService){
        this.carService = carService;
    }


    @GetMapping("/{id:[1-9]{1}[0,9]{0,}}")
    public Car getCar(@PathVariable(name = "id") int id){
        return  carService.findCarById(id);
    }

    @DeleteMapping("/{id:[1-9]{1}[0-9]{0,}}")
    public void deleteCar(@PathVariable(name = "id") int id){
        carService.deleteCarById(id);
    }

    @PostMapping("")
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

    @PutMapping("")
    public void editCar(@RequestBody Car car){
        carService.editCar(car);
    }

    @GetMapping("")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

}
