package SheLikesItRough;

import java.util.Arrays;

public class rusk {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 20 }, { 2, 28}, { 4, 15 }, { 6, 12 }, { 8, 9 }, { 10, 20 } };
        
        Arrays.sort(arr, (b, a) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(arr));

    }
}
