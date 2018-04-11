package ru.yakupov.car_storage;

import ru.yakupov.models.Car;
import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {
    private  static final CarStorage storage;
    static {
        storage=new CarStorage();
    }

    private List<Car> cars=new ArrayList<>();

    private CarStorage(){
        Car bmw5=new Car("BMW","5 series M5",500,6000000);
        Car bmw7=new Car("BMW","7 series 760 LI",300,9000000);
        Car bmwI8=new Car("BMW","I8 Domination", 600,19000000);
        Car mbS600=new Car("Merseces Bens","S 600 Special",300,15000000);
        Car mbE=new Car("Merseces Bens","E class", 350,3000000);

        cars.add(bmw5);
        cars.add(bmw7);
        cars.add(bmwI8);
        cars.add(mbS600);
        cars.add(mbE);
    }

    public static CarStorage storage() {
        return storage;
    }

    // метод, возвращающий список пользователей
    public List<Car> cars() {
        return cars;
    }
}
