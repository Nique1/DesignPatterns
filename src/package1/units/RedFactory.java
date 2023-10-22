package package1.units;

import java.util.NoSuchElementException;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(10,2,20);
            default:
                throw new UnsupportedOperationException("No such element");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(50,15,22);
            default:
                throw new NoSuchElementException("No such element");
        }
    }
}
