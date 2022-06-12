package SheLikesItRough;
import java.util.*;
public class subset {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = { 1, 2, 3 };
        List<Integer> box = new ArrayList<>();
        // generateSubset(list, nums, 0, box);
        // System.out.println(list);
        sameTimeSubsets(list, box, nums, 0);
        System.out.println(list);
    }

    private static void sameTimeSubsets(List<List<Integer>> list, List<Integer> box, int[] nums, int i) {
        list.add(new ArrayList<>(box));
        for (int index = i; index < nums.length; index++) {
            box.add(nums[index]);
            sameTimeSubsets(list, box, nums, index + 1);
            box.remove(box.size() - 1);
        }
    }

    private static void generateSubset(List<List<Integer>> list, int[] nums, int i, List<Integer> box) {
        if (i == nums.length) {
            list.add(new ArrayList<>(box));
            return;
        }
        box.add(nums[i]);
        generateSubset(list, nums, i + 1, box);
        box.remove(box.size() - 1);
        generateSubset(list, nums, i + 1, box);
    }

}
