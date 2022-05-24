package SprintPhase;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TrappedRainWater {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        Stack stack = new Stack<>();
        s(0, arr, stack);
        
    }

    private static void s(int i, int[] arr, Stack stack) {
        if (i == arr.length) {
            System.out.println(stack);
            return;
        }
        
        
        stack.add(arr[i]);
        s(i + 1, arr, stack);
        stack.pop();
        s(i + 1, arr, stack);
    }
}
