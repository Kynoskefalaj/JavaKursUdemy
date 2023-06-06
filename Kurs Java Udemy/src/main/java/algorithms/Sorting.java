package algorithms;

public class Sorting {

    public static void main(String[] args) {
        int[] myArr = {9, 21, 3, 5, 1, 7, 4, 10, 8, 6};
        int[] myArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(myArr);

        System.out.println("---------------------");
        printArray(bubbleSort(myArr));
        System.out.println("---------------------");
        printArray(bubbleSort(myArr2));
        System.out.println("---------------------");
        printArray(insertionSort(myArr));
    }

    static void printArray(int[] arr){
        for (int number : arr) {
            System.out.println(number);
        }
    }

    static int[] bubbleSort(int[] arr) {
        for (int j = arr.length - 1; j >= 0 ; j--) {
            boolean arraySorted = true;
            int lastNum = Integer.MIN_VALUE;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (lastNum != Integer.MIN_VALUE) {
                    if (arr[i] > lastNum) {
                        arr[i + 1] = arr[i];
                        arr[i] = lastNum;
                        arraySorted = false;
                    }
                }
                lastNum = arr[i];
            }
            if (arraySorted == true) {
                return arr;
            }
        }
        return null;
    }

    static int[] insertionSort(int[] arr) {
//        i = 1 because we have to start from second element
        for (int i = 1; i < arr.length; i++) {
            int card = arr[i];
            int j = i;

            while (j > 0 && arr[j-1] > card) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = card;
        }

        return arr;
    }
}
