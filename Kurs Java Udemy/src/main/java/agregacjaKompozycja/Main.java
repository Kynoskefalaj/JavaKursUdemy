package agregacjaKompozycja;

public class Main {

    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jakub", "Okólna", 1, new Praca("technologia", 4000));

        System.out.println(pracownik.toString());
    }
}

class Pracownik{
    String imie;
    Adres adres; //agregacja - łączenie się w całości (niezwiązana z pracownikiem)
    Praca praca; //kompozycja (związany wyłącznie z pracownikiem)

    Pracownik (String imie, String ulica, int numer, Praca praca){
    this.imie = imie;
    this.adres = new Adres(ulica, numer);
    this.praca = praca;
    }

    @Override
    public String toString(){
        return "Imię: " + this.imie + ", Adres: " + this.adres.ulica + " " + adres.numer
                + ", Stanowisko i wynagrodzenie: " + praca.zakresObowiazkow + " " + praca.wynagrodzenie;
    }
}

class Adres{
    String ulica;
    int numer;

    Adres (String ulica, int numer){
        this.ulica = ulica;
        this.numer = numer;
    }
}

class Praca{
    String zakresObowiazkow;
    double wynagrodzenie;

    Praca (String zakresObowiazkow, double wynagrodzenie){
        this.zakresObowiazkow = zakresObowiazkow;
        this.wynagrodzenie = wynagrodzenie;
    }
}