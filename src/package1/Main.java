package package1;

import package1.cars.BMWModel;
import package1.cars.Car;
import package1.cars.FordModel;

public class Main {

    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonWealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw);


        Car ford = continentalFactory.buildFord(FordModel.FOCUS);
        System.out.println(ford);



    }

}
