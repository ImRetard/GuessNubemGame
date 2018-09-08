
package lesson_9;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Car cars[] = new Car[2];

        Car audiRS = new Car("Audi", "RS6",2016,10000,95,20000);
        audiRS.showCar();


//        for (int i = 0; i < cars.length; i++) {
//            cars[i] = new Car();
//            fillCarInfo(cars[i]);
//        }
//
//        for (int i = 0; i <  cars.length; i++) {
//            //shorCar(cars[i]);
//            cars[i].showCar();
//        }


//        Car c1 = new Car();
//        Car c2 = new Car();
//        Car c3 = c1;
//
//        fillCarInfo(c1);
//        fillCarInfo(c2);
//        shorCar(c1);
//        shorCar(c2);
    }

    public static void fillCarInfo(Car c) {

        //c.model = input.next();
//        System.out.print("Year: ");
//        c.year = input.nextInt();
//        System.out.print("Distance: ");
//        c.distance = input.nextInt();
//        System.out.print("Fuel: ");
//        c.fuel = input.nextInt();
//        System.out.print("Price: ");
//        c.price = input.nextInt();
    }


}



/*
Железный кузов
Колеса
Управление
Переднее стекло


Марка
Модель
Год
Пробег
Топливо
Цена

Авто ручная кпп
Доп инфо

 *//*


*/
/*
Abstraction => Class => Objects
BS =>20        5-7      1...*

Car c; <= Object link type Car
c = new Car();


 */
