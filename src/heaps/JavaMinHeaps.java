package heaps;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMinHeaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        MinHeap minHeap = new MinHeap();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
//            minHeap.insert(sc.nextInt());
        }

        MinHeap minHeap = new MinHeap(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(minHeap.extractMin());
        }
    }
}
