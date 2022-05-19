public class klasyZagniezdzone {

    public static void main(String[] args) {
        OuterClass  outerClass = new OuterClass(); // Tworząc obiekt w ten sposób wywołamy tylko konstruktor klasy zewnętrznej

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(); // Nie można stworzyć instancji klasy wewnętrznej bez klasy zewnętrznej

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass(); // Instancje statycznej klasy zagnieżdżonej można wywołać bez klasy zewnętrznej

    }
}

class OuterClass {

    private int outerField;

    OuterClass(){
        System.out.println("Wywołanie konstruktora z klasy zewnętrznej.");
    }

    class InnerClass{

        private int innerField;
        static int staticField; // Z tego poziomu nie ma dostępu do statycznych pól

        InnerClass(){
            System.out.println("Wywołanie konstruktora z klasy wewnętrznej.");
        }

        void innerMethod(){
            // z klasy wewnętrznej mamy dostęp do pól klasy zewnętrznej <BEZ THIS.>
            outerField = 5;
        }

    }

    void outerMethod(){
        //tmp = 2; KLASA ZEWNĘTRZNA NIE MA DOSTĘPU DO PÓL KLASY WEWNĘTRZNEJ W TEN SPOSÓB
        InnerClass innerClassObject = new InnerClass();
    }

    static class StaticInnerClass {

        static int staticField;

        StaticInnerClass(){
            System.out.println("Wywołanie konstruktora ze statycznej klasy zagnieżdżonej.");
        }
    }
}

//static class dfsdf{ //Klasy statyczne isntnieją tylko jako klasy zagnieżdżone

//}

