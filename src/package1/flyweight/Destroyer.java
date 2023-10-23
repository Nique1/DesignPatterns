package package1.flyweight;

public class Destroyer {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y) {
        stats = UnitStatsRepo.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
