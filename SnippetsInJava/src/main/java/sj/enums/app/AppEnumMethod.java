package sj.enums.app;

import sj.enums.enums.EnumMethodAbstratc;
import sj.model.SubClass.Car;

public class AppEnumMethod {

    public static void main(String[] args) {

        Car car = new Car();

        car.setName("Corolla");
        car.setType(EnumMethodAbstratc.CAR.geraCategory());

        System.out.println("Name Car: " + car.getName() + "\nType Car: " + car.getType());
    }
}
