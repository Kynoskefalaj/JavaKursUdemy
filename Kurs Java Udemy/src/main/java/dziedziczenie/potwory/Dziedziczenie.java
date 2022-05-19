package dziedziczenie.potwory;

public class Dziedziczenie {
    public static void main(String[] args) {
        Skeleton skeleton = new Skeleton(23, 200, "rare");

        System.out.println(skeleton.loot);

        Monster m = new Skeleton(10, 200, "poor");
        metodaKorzystającaZPolimorfii(m);

        m.speed = 23;


        System.out.println(m.equals(skeleton));
        System.out.println(skeleton.toString());
        System.out.println(m.toString());
        System.out.println(((Monster)m).toString());

        System.out.println(m.getClass());
        System.out.println(skeleton.getClass());

    }

    static void metodaKorzystającaZPolimorfii(Monster monster){
        System.out.println("HP: " + monster.hp);
    }


}
