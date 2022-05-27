package SprintPhase;

import java.lang.Character.Subset;
import java.util.Stack;

public class Rexzz {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Stack<Integer> stack = new Stack<>();
        pubset(arr, stack, arr.length - 1);
        
    }
    private static void pubset(int[] arr, Stack<Integer> ds, int n) {
        if (n == -1) {
            System.out.println(ds);
            return;
        }
        ds.push(arr[n]);
        pubset(arr, ds, n - 1);
        ds.pop();
        pubset(arr, ds, n - 1);
    } 
}
