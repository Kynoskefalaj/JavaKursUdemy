package algorithms;

import java.util.Arrays;

public class Recursion{

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Sum is:" + sum(myArr));

        System.out.println("Array length is: " + count(myArr));

        System.out.println("Maximum value is: " + max(myArr));
    }

    static int sum(int[] arr){
        if (arr.length == 0){
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    static int count(int[] arr){
        if (arr.length == 0){
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    static int max(int[] arr){
        if (arr.length == 2){
            if (arr[0] > arr[1]){
                return arr[0];
            } else
                return arr[1];
        } else {
            if (arr[0] > max(Arrays.copyOfRange(arr, 1, arr.length))){
                return arr[0];
            } else
                return max(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
