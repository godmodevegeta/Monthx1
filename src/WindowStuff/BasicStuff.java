package WindowStuff;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BasicStuff {
    public static void main(String[] args) {
        // Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int k = 2, n = arr.length;
        int[][] arr = { { 5, 3 }, { 6, 3 }, { 0, 2 }, { 4, 8 }, { 1, 3 }, { 6, 7 } };
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr, (o1, o2) -> o2[1] - o1[1]);

        // Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]));
        System.out.println(Arrays.deepToString(arr));

    }
}
