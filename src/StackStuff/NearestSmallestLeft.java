package StackStuff;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestLeft {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 5, 9, 5, 6, 7, 3, 5, 7 };
            // ans = { 0, 3, 0, 1, 5, 1, 5, 6, 1, 3, 5 }
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.empty()) {
                ans[i] = 0;
                stack.add(nums[i]);
            }
            if (stack.peek() < nums[i]) {
                ans[i] = stack.peek();
                stack.add(nums[i]);
            }
            if (stack.peek() > nums[i]) {
                while (!stack.empty() && stack.peek() >= nums[i]) stack.pop();
                if (stack.empty()) ans[i] = 0;
                else {
                    ans[i] = stack.peek();
                }  
                stack.add(nums[i]);
            }

        }

        System.out.println(Arrays.toString(ans));

    }
}

// for (int i = 0; i < nums.length; i++) {
// for (int j = i - 1; j >= 0; j--) {
// if (nums[i] > nums[j]) {
// ans[i] = nums[j];
// break;
// } else {
// ans[i] = 0;
// }
// }
// }