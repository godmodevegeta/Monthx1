import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsManipulations {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> box = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            box.add(0, 1);
            System.out.println(box);
            int size = box.size();
            for (int j = 1; j < size - 1; j++) {
                box.set(j, box.get(j) + box.get(j + 1));
            }
            list.add(new ArrayList<>(box));
        }
        System.out.println(list);
    }
}
