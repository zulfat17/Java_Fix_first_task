package ru.yakupov.models;

public class Car {
    public String company=null;
    public  String model=null;
    public int maxSpeed=0;
    public int price=0;
    public Car(){

    }
    public Car(String company,String model, int maxSpeed,int price){
        this.company=company;
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.price=price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
