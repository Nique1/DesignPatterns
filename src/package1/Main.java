package package1;

import package1.units.*;

public class Main {

    public static void main(String[] args) {
       Factory blueFactory = new BlueFactory();
       Factory redFactory = new RedFactory();

       MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
       InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

       InfantryUnit blueTank = blueFactory.createInfantryUnit(UnitType.TANK);
       MechanizedUnit blueRifleman = blueFactory.createMechanizedUnit(UnitType.TANK);


    }

}
