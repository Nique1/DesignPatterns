package package1.cars;

import package1.SteeringWheelPosition;

public abstract class Car {
    private final double engineCapacity;
    private final String fuelType;
    private final int productionYear;
    private final SteeringWheelPosition position;


    public Car(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.position = position;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", productionYear=" + productionYear +
                ", position=" + position +
                '}';
    }
}
