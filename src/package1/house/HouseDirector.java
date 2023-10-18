package package1.house;

public class HouseDirector {
    private HouseBuilder houseBuilder;
    public  HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildDoors();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
