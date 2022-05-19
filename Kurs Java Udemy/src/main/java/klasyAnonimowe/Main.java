package klasyAnonimowe;

public class Main {

    public static void main(String[] args) {

//        ZachowaniePoWcisnieciu z = new Przycisk();
//        z.akcja();

//        Zamiast implementować dla każdego przycisku interfejs z zachowaniemPoWcisnieciu to można utworzyć klasę anonimową
//        Tak stworzona klasa anonimowa implementuje interfejs

        ZachowaniePoWcisnieciu zet = new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        };

        zet.akcja();

        Przycisk p = new Przycisk();
        p.dodajAkcje(zet);


//  Zamiast tworzyć zmienną pomocniczą "zet" Można przesłać jako argument całą klasę anonimową
        p.dodajAkcje(new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        });
    }
}

interface ZachowaniePoWcisnieciu{
    void akcja();
}


class Przycisk {

    void dodajAkcje (ZachowaniePoWcisnieciu z) {
        z.akcja();
    }
}
//class Przycisk implements ZachowaniePoWcisnieciu{
//
//
//    @Override
//    public void akcja() {
//        System.out.println("Jestem z przycisku 1");
//    }
//}
//
//class Przycisk2 implements ZachowaniePoWcisnieciu{
//
//
//    @Override
//    public void akcja() {
//        System.out.println("Jestem z przycisku 2");
//    }
//}
//
//class Przycisk3 implements ZachowaniePoWcisnieciu{
//
//
//    @Override
//    public void akcja() {
//        System.out.println("Jestem z przycisku 3");
//    }
//}
