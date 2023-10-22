package package1.units;

import java.util.NoSuchElementException;

public class BlueFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(20,2,1);
            default:
                throw new UnsupportedOperationException("No such element");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(20,15,1);
            default:
                throw new NoSuchElementException("No such element");
        }
    }
}
