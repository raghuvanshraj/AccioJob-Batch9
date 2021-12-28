package heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindMedianInStream {
    static float median(int x, int y) {
        return ((float) x + y) / 2;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (maxHeap.isEmpty()) {
                maxHeap.add(x);
            } else if (maxHeap.size() > minHeap.size()) {
                if (x < maxHeap.peek()) {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(x);
                } else {
                    minHeap.add(x);
                }
            } else {
                if (x < maxHeap.peek()) {
                    maxHeap.add(x);
                } else {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(x);
                }
            }

            if (minHeap.size() == maxHeap.size()) {
                System.out.print(median(minHeap.peek(), maxHeap.peek()) + " ");
            } else {
                System.out.print(median(maxHeap.peek(), maxHeap.peek()) + " ");
            }
        }
    }
}
