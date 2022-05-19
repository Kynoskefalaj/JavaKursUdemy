public class breakContinue {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++)
            if (j % 2 != 0) {

                for (int i = 1; i <= 10; i++) {
                    System.out.print(i * j + " ");
                }
                System.out.println();

            }
    }
}
