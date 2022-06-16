package StackStuff;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreatestLeft {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 5, 9, 10, 11, 7, 3, 5, 7 };
            // ans = { 0, 0, 7, 7, 0, 0,  0, 11, 7, 7, 11 }
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.empty()) {
                ans[i] = 0; 
                stack.add(nums[i]);
            }
            if (stack.peek() > nums[i]) {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
            if (stack.peek() < nums[i]) {
                while (!stack.empty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.empty()) {
                    ans[i] = 0; 
                    stack.push(nums[i]);
                } else {
                    ans[i] = stack.peek();
                    stack.push(nums[i]);
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

// for (int i = 0; i < nums.length; i++) {
// for (int j = i - 1; j >= 0; j--) {
// if (nums[i] < nums[j]) {
// ans[i] = nums[j];
// break;
// }
// else ans[i] = 0;
// }
// }
