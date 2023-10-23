package package1;

import package1.cars.*;

import java.util.NoSuchElementException;

public class ContinentalFactory implements Factory {
    @Override
    public Car buildFord(FordModel model) {
        switch (model){
            case  CMAX:
                return new Ford(2.0, "LPG", 2001, SteeringWheelPosition.LEFT);
            case FOCUS:
                return new Ford(2.2, "Benzine", 2006, SteeringWheelPosition.LEFT);
            default:
                throw new NoSuchElementException("No such element");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model){
            case  X5:
                return new BMW(2.0, "Diesel", 2011, SteeringWheelPosition.LEFT);
            case E60:
                return new BMW(1.6, "Benzine", 2012, SteeringWheelPosition.LEFT);
            default:
                throw new NoSuchElementException("No such element");
        }
    }
}
