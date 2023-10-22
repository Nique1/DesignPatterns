package package1;

import package1.units.*;

public class Main {

    public static void main(String[] args) {
       Factory factory = new UnitFactory();

       Unit tank = factory.createUnit(UnitType.TANK);
       Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);


    }

}
