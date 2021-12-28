package heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    int v = sc.nextInt();
                    minHeap.add(v);
                    break;
                case 2:
                    v = sc.nextInt();
                    minHeap.remove(v);
                    break;
                case 3:
                    System.out.println(minHeap.peek());
                    break;
            }
        }
    }
}
