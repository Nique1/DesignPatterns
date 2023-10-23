package package1.flyweight;

public class TeslTank {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public TeslTank(int x, int y) {
        this.stats = UnitStatsRepo.getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
