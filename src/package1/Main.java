package package1;

import package1.flyweight.Destroyer;
import package1.flyweight.Rifleman;
import package1.flyweight.TeslTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> activeUnit = new ArrayList<>();
        for (int i = 0; i <10_000_000 ; i++) {
            activeUnit.add(new TeslTank(0,0));
            activeUnit.add(new Rifleman(0,0));
            activeUnit.add(new Destroyer(0,0));
        }


    }

}
