package heaps;

import java.util.ArrayList;

public class MinHeap {
    static int left(int i) {
        return 2 * i + 1;
    }

    static int right(int i) {
        return 2 * i + 2;
    }

    static int parent(int i) {
        return (i - 1) / 2;
    }

    private ArrayList<Integer> tree;

    MinHeap(ArrayList<Integer> arr) {
        this.tree = new ArrayList<>(arr);
        int n = arr.size();
        for (int i = n - 1; i >= 0; i--) {
            this.minHeapifyTopDown(i);
        }
    }

    MinHeap() {
        this.tree = new ArrayList<>();
    }

    void insert(int x) {
        this.tree.add(x);
        this.minHeapifyBottomUp();
    }

    void removeMin() {
        int j = this.tree.size() - 1;
        this.swap(0, j);
        this.tree.remove(j);
        this.minHeapifyTopDown(0);
    }

    int extractMin() {
        int minElement = this.tree.get(0);
        this.removeMin();
        return minElement;
    }

    void swap(int i, int j) {
        int temp = this.tree.get(j);
        this.tree.set(j, this.tree.get(i));
        this.tree.set(i, temp);
    }

    void minHeapifyTopDown(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < this.tree.size() && this.tree.get(l) < this.tree.get(smallest)) {
            smallest = l;
        }
        if (r < this.tree.size() && this.tree.get(r) < this.tree.get(smallest)) {
            smallest = r;
        }

        if (smallest != i) {
            this.swap(i, smallest);
            this.minHeapifyTopDown(smallest);
        }
    }

    void minHeapifyBottomUp() {
        int i = this.tree.size() - 1;
        while (i != 0 && this.tree.get(parent(i)) > this.tree.get(i)) {
            this.swap(i, parent(i));
            i = parent(i);
        }
    }
}
