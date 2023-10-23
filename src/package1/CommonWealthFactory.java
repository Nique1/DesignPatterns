package package1;

import package1.cars.*;

import java.util.NoSuchElementException;

public class CommonWealthFactory implements Factory {
    @Override
    public Car buildFord(FordModel model) {
        switch (model){
            case  CMAX:
                return new Ford(2.0, "LPG", 2001, SteeringWheelPosition.RIGHT);
            case FOCUS:
                return new Ford(2.2, "Benzine", 2006, SteeringWheelPosition.RIGHT);
            default:
                throw new NoSuchElementException("No such element");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model){
            case  X5:
                return new BMW(2.0, "Diesel", 2011, SteeringWheelPosition.RIGHT);
            case E60:
                return new BMW(1.6, "Benzine", 2012, SteeringWheelPosition.RIGHT);
            default:
                throw new NoSuchElementException("No such element");
        }
    }
}
