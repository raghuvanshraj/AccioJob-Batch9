package heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementInStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        while (n-- > 0) {
            int x = sc.nextInt();
            minHeap.add(x);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
            if (minHeap.size() < k) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(minHeap.peek() + " ");
            }
        }
    }
}
