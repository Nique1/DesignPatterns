package package1;

import package1.cars.BMWModel;
import package1.cars.Car;
import package1.cars.FordModel;

public interface  Factory {
    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);

}
