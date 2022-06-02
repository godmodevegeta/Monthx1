package HeapStuff;

import java.util.PriorityQueue;

public class HeapApp {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < 9; i++) {
            heap.add(i);
        }
        System.out.println(heap);
    }
}
