package SheLikesItRough;

import java.util.ListIterator;
import java.util.PriorityQueue;
// import javafx.util

public class QueuePriority {
    public static void main(String[] args) {
        PriorityQueue<int[]> heap = new PriorityQueue<>();
        // PriorityQueue<Pair<Integer, Integer>> heap2 = new PriorityQueue<>();
        ListIterator<int[]> iterator = (ListIterator) heap.iterator();
        heap.add(new int[] { 2, 5 });
        heap.add(new int[] { 4, 6 });
        heap.add(new int[] { 5, 7 });
        heap.add(new int[] { 6, 8 });
        heap.add(new int[] { 7, 9 });

        System.out.println(heap.size());
        System.out.println(heap);
        for (int i  = 0; i< heap.size(); i++){
            System.out.print(i + " ");
            System.out.println(heap.poll());
        }    
    }
}
