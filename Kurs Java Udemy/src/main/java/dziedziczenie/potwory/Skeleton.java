package dziedziczenie.potwory;

public class Skeleton extends Monster {
    String loot = "legendary";

    public Skeleton(double speed, double hp, String loot){
        super(speed, hp);
        this.loot = loot;
    }

}
