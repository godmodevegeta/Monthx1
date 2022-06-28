package SearchInBinary;

import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 3, 0, 9, 7, 2, 3, 5, 1, 7 };
        System.out.println(searchBinary(arr, 0));
        
    }

    private static int searchBinary(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {

            } else if (arr[mid] < target) {

            } else return mid;
        }
        return -1;
    }
}
