package algorithms;

import java.util.Arrays;

public class Recursion{

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("" + sum(myArr));
    }

    static int sum(int[] arr){
        if (arr.length == 0){
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
