package algorithms;

public class BinarySearching {

    public static void main(String[] args) {


        int[] table = {1, 13, 15, 21, 23, 45, 54, 65, 72, 73, 124, 135, 223};
        int min = 0;
        int max = table.length - 1;
        int mid;
        int num = 122534;

        while (min <= max) {
            mid = (min + max) / 2;
            if (table[mid] == num) {
                System.out.println("Searched number is found at index: " + mid);
                break;
            } else if (table[mid] < num){
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (min > max){
                System.out.println("Number doesn't found.");
            }
        }


    }
}
