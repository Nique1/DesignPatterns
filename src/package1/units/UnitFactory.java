package package1.units;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(200, 20, 12);
            case RIFLEMAN:
                return new Rifleman(120, 12, 22);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

}
