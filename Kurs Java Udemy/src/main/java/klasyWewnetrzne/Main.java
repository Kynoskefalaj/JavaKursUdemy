package klasyWewnetrzne;

public class Main {

    public static void main(String[] args) {

        KontoBankowe kontoBankowe = new KontoBankowe(1000);

        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.utworzKonto(5);
        System.out.println(kontoBankowe.getStanKonta());

    }
}

// Klasy zagnieżdżone tworzy się w celu zwiększenia przejrzystości kodu
class KontoBankowe {

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    public double getStanKonta() {
        return this.stanKonta;
    }

    void utworzKonto(final double stopa) {
//        Można utworzyć klasę wewnątrz metody (ma to sens jeśli np tworzymy metodę która będzie korzystać z instancji tej klasy
// Dzięki takiemu zapisowi mamy posegregowany kod, wszelkie metody związane z odsetkami są w klasie odsetki
// Odsetki nie mogą istnieć bez konta bankowego
        class Odsetki {

            private double stopaProcentowa;

            public Odsetki(double stopaProcentowa) {
                this.stopaProcentowa = stopaProcentowa;
                this.zmienStanKonta();
            }

            void zmienStanKonta() {
                double odsetki = (stanKonta * stopa) / 100;
                stanKonta += odsetki;
            }
        }
        Odsetki odsetki = new Odsetki(stopa);

    }




}

