import java.util.Arrays;

public class interfejsy {

    public static void main(String[] args) {
        System.out.println((nazwaInterfejsu.PI));

        nazwaInterfejsu instancja = new Pracownik(10000); //Zmienna typu interfejsowego może wskazywać na adres
        //klasy która implementuje taki interfejs

        instancja.przykladowaMetoda();
        //Aby wykorzystać metodę z klasy implementującej na takim obiekcie interfejsowym należy użyć rzutowania w dół
        System.out.println("Wynagrodzenie pracownika: " + ((Pracownik)instancja).getWynagrodzenie());

        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik(23000);
        pracownicy[1] = new Pracownik(32000);
        pracownicy[2] = new Pracownik(12300);

        System.out.println("Wynagrodzenie pracowników przed sortowaniem: ");
        for (Pracownik pracownik: pracownicy){
            System.out.println(pracownik.getWynagrodzenie());
        }


        Arrays.sort(pracownicy);
        System.out.println("Wynagrodzenie pracowników po sortowaniu: ");
        for (Pracownik pracownik: pracownicy){
            System.out.println(pracownik.getWynagrodzenie());
        }

    }
}

interface nazwaInterfejsu{
    double PI = 3.14; //public static final

    void przykladowaMetoda(); //public abstract
}

class Pracownik implements nazwaInterfejsu, Comparable{

    @Override
    public void przykladowaMetoda(){
        System.out.println("Nadpisanie metody z interfejsu");
    }

    public double wynagrodzenie;

    Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public double getWynagrodzenie(){
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object t){

        Pracownik tmp = (Pracownik)t;

        if (this.wynagrodzenie > tmp.wynagrodzenie){
            return 1;
        }

        if (this.wynagrodzenie < tmp.wynagrodzenie){
            return -1;
        }
        // skoro powyższe warunki nie zostały spełnione to obiekty są sobie równe
        return 0;
    }
}