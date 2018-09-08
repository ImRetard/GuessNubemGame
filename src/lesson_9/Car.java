package lesson_9;

import java.util.Scanner;

public class Car {
    private String vendor;
    private String model;
    private int year;
    private int distance;
    private int fuel;
    private int price;


    public Car() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Vendor: ");
            setVendor(input.next());
        } while (getVendor().equals(""));

        this.model = "";
        this.year = 2018;
        this.distance = 1;
        this.fuel = 92;
        this.price = 10000;
    }

    public Car(String vendor, String model, int year, int distance, int fuel, int price) {
        setVendor(vendor);
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.fuel = fuel;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        if(vendor.length()>2){
            this.vendor = vendor;
        }else{
            System.out.println("Incorrect vendor name!!!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showCar() {
        System.out.println("Car info: "
                + vendor + "\t"
                + model + "\t"
                + year + "\t"
                + distance + "\t"
                + fuel + "\t"
                + price + "\t");
    }
}


/*
Марка
Модель
Год
Пробег
Топливо
Цена

 */