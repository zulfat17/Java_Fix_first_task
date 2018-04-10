package ru.yakupov.repository;

import ru.yakupov.car_storage.CarStorage;
import ru.yakupov.models.Car;

import java.util.List;

public class CarsRepositoryInMemoryImpl implements CarRepository {
    @Override
    public List<Car> findAll() {
        return CarStorage.storage().cars();
    }
//
//    @Override
//    public void save(Car cars) {
//        CarStorage.storage().cars().add(cars);
//    }
//
//    @Override
//    public boolean isExist(String company, String model, int maxSpeed, int price) {
//        return false;
//    }
}
