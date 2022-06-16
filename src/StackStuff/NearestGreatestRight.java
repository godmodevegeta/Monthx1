package StackStuff;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreatestRight {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 5, 9, 5, 6, 7, 3, 5, 7 };
            // ans = { 7, 9, 5, 9, 0, 6, 7, 0, 5, 7, 0 }
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                ans[i] = 0;
                stack.push(nums[i]);
            }
            if (stack.peek() > nums[i]) {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
            if (stack.peek() < nums[i]) {
                while (!stack.empty() && stack.peek() <= nums[i]) stack.pop();
                if (stack.empty()) {
                    ans[i] = 0;
                    stack.push(nums[i]);
                } else {
                    ans[i] = stack.peek();
                    stack.push(nums[i]);
                }
            }

            System.out.println(Arrays.toString(ans));

        }

        
    }
}

// for (int i = 0; i < nums.length - 1; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[j] > nums[i]) {
// ans[i] = nums[j];
// break;
// } else
// ans[i] = 0;
// }
// }