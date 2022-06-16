package StackStuff;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestRight {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 5, 9, 10, 11, 7, 3, 5, 7 };
            // ans = { 1, 1, 0, 3, 7,  7,  7, 3, 0, 0, 0 }
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1 ; i >= 0; i--) {
            if (stack.empty()) {
                ans[i] = 0;
                stack.push(nums[i]);
            }
            if (stack.peek() < nums[i]) {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
            if (stack.peek() > nums[i]) {
                while (!stack.empty() && stack.peek() >= nums[i]) stack.pop();
                if (stack.empty()) {
                    ans[i] = 0;
                    stack.add(nums[i]);
                } else {
                    ans[i] = stack.peek();
                    stack.add(nums[i]);
                }

            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
