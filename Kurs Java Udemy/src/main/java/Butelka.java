public class Butelka {
    private double ileLitrów;
    private double pojemnosc;

    Butelka(double ileLitrów, double pojemnosc){
        this.ileLitrów = ileLitrów;
        this.pojemnosc = pojemnosc;
    }

    public double getIleLitrów() {
        return ileLitrów;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void wlej(double ileWlac) {
        if (pojemnosc >= ileLitrów + ileWlac) {
            this.ileLitrów += ileWlac;
        } else {
            System.out.println("Niewystarczająca pojemność, wylało się: " + (pojemnosc - (ileLitrów + ileWlac)));
            this.ileLitrów = pojemnosc;
        }
    }

    public void wylej(double ileWylac) {
        if (ileLitrów >= ileWylac) {
            this.ileLitrów -= ileWylac;
        } else {
            System.out.println("Nie wystarczająca ilość wody.");
        }
    }

    public void przelej(double ilePrzelac, Butelka przelejDoTego) {
        this.wylej(ilePrzelac);
        if (this.pojemnosc >= ilePrzelac) {
            przelejDoTego.wlej(ilePrzelac);
        } else {
            przelejDoTego.wlej(this.pojemnosc);
        }
    }


    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        int i = 0;
        for (Butelka element: butelka){
            butelka[i] = new Butelka((i + 1) * 5, (i + 1) * 7);
            i++;
        }
        i = 0;

        for (int j = 0; j < butelka.length; j++) {
            System.out.println("Pojemność butelki " + (j + 1) + ": " + butelka[j].pojemnosc);
            System.out.println("Zawartość butelki " + (j + 1) + ": " + butelka[j].ileLitrów + "\n");
        }

        butelka[0].przelej(5, butelka[1]);
        System.out.println(butelka[1].ileLitrów);
    }
}