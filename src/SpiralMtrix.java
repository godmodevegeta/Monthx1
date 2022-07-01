import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMtrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        makeMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix)); 
        spiralTransversal(matrix);

    }
    public static void spiralTransversal(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int dir = 0;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
            } else if (dir == 1){
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i>= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            System.out.println(list);
            dir = (dir + 1) % 4;
        }
        System.out.println(list);
    }

    public static void makeMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = count++;
            }
        }
    }
}
