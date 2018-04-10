package ru.yakupov.repository;

import ru.yakupov.models.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();
//    void save(Car cars);
//    boolean isExist(String company, String model, int maxSpeed, int price);
}
