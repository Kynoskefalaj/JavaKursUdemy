public class petlaWhile {

    public static void main(String[] args) {

        int[] tab = new int[10];


        int i = 0;

        while (i < tab.length)
        {
            tab[i] += (i+1) * 10;
            i++;
        }


        int j = 0;

        do
        {
            System.out.println(tab[j]);
            j++;
        } while (j < tab.length);
    }
}
