package package1.flyweight;

public class UnitStatsRepo {
    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 12, 12);
    private static UnitStats teslaTankStats = new UnitStats("TeslaTank", 200, 100, 50, 25);
    private static UnitStats riflemanStats = new UnitStats("Rifleman", 25, 5, 20, 25);


    private UnitStatsRepo() {
    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }

    public static UnitStats getTeslaTankStats() {
        return teslaTankStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }
}
