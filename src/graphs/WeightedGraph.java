package graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.PriorityQueue;

public class WeightedGraph {

    static class Node implements Comparable<Node> {
        int v;
        int w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }

    ArrayList<Node>[] adjacencyList;
    int n;

    WeightedGraph(int n) {
        this.n = n;
        adjacencyList = (ArrayList<Node>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v, int w) {
        adjacencyList[u].add(new Node(v, w));
        adjacencyList[v].add(new Node(u, w));
    }

    public int dijkstra(int u, int v) {
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[u] = 0;
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        boolean[] done = new boolean[n];
        minHeap.add(new Node(u, 0));
        while (!done[v]) {
            if (minHeap.isEmpty()) {
                return -1;
            }

            int x = minHeap.poll().v;
            done[x] = true;
            processNeighbours(x, dist, done, minHeap);
        }

        return dist[v];
    }

    void processNeighbours(int x, int[] dist, boolean[] done, PriorityQueue<Node> minHeap) {
        for (Node node : adjacencyList[x]) {
            int y = node.v;
            int w = node.w;
            if (!done[y]) {
                int curr = dist[x] + w;
                if (curr < dist[y]) {
                    dist[y] = curr;
                }

                minHeap.add(new Node(y, dist[y]));
            }
        }
    }
}
