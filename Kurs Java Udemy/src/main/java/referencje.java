public class referencje {

    public static void main(String[] args) {

//        ZMIENNE PRYMITYWNE
        int a = 10;
        int b = 2000;
        b = a;
        System.out.println(a);
        a = b;
        System.out.println(a);

//        REFERENCJE
        Test test1 = new Test();
        Test test2 = test1;

//        DYGRESJA
        if (test1 == test2) {
            System.out.println("Porównując dwa typu referencyjne porównuje się ich adresy." +
                    " Stąd ten tekst został wypisany.");}

//        C.D.
        test2.testField = 69;
        System.out.println("Wynik pola z obiektu pierwszego po przypisaniu obiektu drugiego " +
                "do pierwszego i zmiany pola drugiego: " + test1.testField + "\n");

//        Przywrócenie wartości początkowej
        test1.testField = 666;

//        Stworzenie nowego obiektu
        Test test3 = new Test();
        test3.testField = test1.testField;
        System.out.println("Utworzenie nowej referencji i przypisanie wartości " +
                "pola testField z obiektu test1 do test3: " + test3.testField);
    }
}

class Test {
    int testField = 666;
}
