package SprintPhase;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Rexzz {
    int a;
    static List<Stack<Integer>> box;
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Stack<Integer> stack = new Stack<>();
        pubset(arr, stack, 0);
        box.add(null);
    }
    private static void pubset(int[] arr, Stack<Integer> stack, int i) {
        if (i == arr.length && stack != null) {
            box.add(stack);
            return;
        }
        stack.push(arr[i]);
        pubset(arr, stack, i + 1);
        stack.pop();
        pubset(arr, stack, i + 1);
    }
    
}
