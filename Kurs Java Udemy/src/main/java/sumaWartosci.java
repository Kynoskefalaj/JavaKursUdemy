public class sumaWartosci {
//    ćwiczenie na pętle
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 67, 23, 12, 51, 235};
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
