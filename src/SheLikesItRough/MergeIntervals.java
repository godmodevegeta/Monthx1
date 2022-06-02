package SheLikesItRough;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, {11, 14}, {14, 15}, {18, 23} };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    private static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        Stack<int[]> stack = new Stack<>();
        for (int[] it : intervals) {
            if (stack.empty() || stack.peek()[1] < it[0]) stack.push(it);
            else {
                int[] box = {Math.min(stack.peek()[0], it[0]), Math.max(stack.peek()[1], it[1])};
                stack.pop();
                stack.push(box);
            }
        }
        for (int[] o : stack) {
            System.out.println(Arrays.toString(o));
        }
        return intervals;
        
        
    }
}
