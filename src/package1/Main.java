package package1;

import package1.house.House;

public class Main {

    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildRooms("room")
                .buildWindows("windows")
                .build();

        System.out.println(house);

    }
}
