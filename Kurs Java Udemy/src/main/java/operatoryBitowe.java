public class operatoryBitowe {
    public static void main(String[] args) {
        int x = 15; // w systemie binarnym: 0101
        int y = 11; // w systemie binarnym: 0111

        /*
        Koniunkcja (AND)
        Porównuje kolejne pozycje w dwóch ciągach bitowych.
        Jeśli co najmniej jedna z nich zawiera 0, wówczas wynikiem będzie 0.
        Jeśli obie zawierają jedynkę, wynikiem będzie 1.
        0101 & 0111 = 0101 = 5
         */
        System.out.println("x & y = " + (x & y));

        /*
        Alternatywa (OR)
        Porównuje kolejne pozycje w dwóch ciągach bitowych.
        Jeśli co najmniej jedna z nich zawiera 1, wówczas wynikiem będzie 1.
        Jeśli obie zawierają 0, wynikiem będzie 0.
        Dla dwóch jedynek otrzymamy 1.
        0101 | 0111 = 0111 = 7
         */
        System.out.println("x | y = " + (x | y));

        /*
        Alternatywa wykluczająca (XOR)
        Porównuje kolejne pozycje w dwóch ciągach bitowych.
        Jeśli obie zawierają jedynkę, wynikiem będzie 0.
        Jeśli tylko jedna zawiera jedynkę, wynikiem będzie 1.
        0101 ^ 0111 = 0010 = 2
        11010 ^ 01010 = 10000 = 16
         */
        System.out.println(("x ^ y = " + (x ^ y)));
        System.out.println("11010 ^ 01010 = " + (x ^ y));

        /*
        Przesunięcie w lewo x << 2
        Przesunięcie w prawo x >> 3
         */
        System.out.println("przesunięcie " + (18 >> 3));
        }
    }
