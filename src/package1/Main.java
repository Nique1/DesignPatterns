package package1;

import package1.flightMonitoring.FlightLeg;
import package1.house.House;

public class Main {

    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder()
                .buildFrom("Los Angeles")
                .buildTo("Las Vegas")
                .buildPrice(50.0)
                .build();
//        FlightLeg flightLeg1 = new FlightLeg.FlightLegBuilder()
//                .buildFrom("New York")
//                .buildTo("Warsaw")
//                .build();

        System.out.println(flightLeg);
//        System.out.println(flightLeg1);
    }

}
