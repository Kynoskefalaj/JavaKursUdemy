package dziedziczenie.potwory;

public class Monster {
    protected double speed = 10;
    double hp = 100;

    public Monster(double speed, double hp){
        this.speed = speed;
        this.hp = hp;
    }

    @Override
    public boolean equals(Object obj){
        Monster randomMonster =(Monster)obj;

        return this.speed == randomMonster.speed && this.hp == randomMonster.hp;
    }

    @Override
    public String toString(){
        return "Monster's hp: " + this.hp + ", Monster's speed: " + this.speed;
    }
}
