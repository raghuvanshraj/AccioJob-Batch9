package heaps;

import java.util.ArrayList;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        MinHeap minHeap = new MinHeap(arr);
        for (int i = 0; i < n; i++) {
            arr.set(i, minHeap.extractMin());
        }

        System.out.println(arr);
    }
}
