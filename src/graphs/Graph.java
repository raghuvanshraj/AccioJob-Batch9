package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<Integer>[] adjacencyList;
    int n;

    Graph(int n) {
        this.n = n;
        adjacencyList = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList[u].add(v);
        adjacencyList[v].add(u);
    }

    public void bfs(int u) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[n];
        isVisited[u] = true;
        queue.add(u);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int y : adjacencyList[x]) {
                if (!isVisited[y]) {
                    isVisited[y] = true;
                    queue.add(y);
                }
            }
        }
    }

    void _dfs(int u, boolean[] isVisited) {
        isVisited[u] = true;
        System.out.print(u + " ");
        for (int v : adjacencyList[u]) {
            if (!isVisited[v]) {
                _dfs(v, isVisited);
            }
        }
    }

    public void dfs(int u) {
        boolean[] isVisited = new boolean[n];
        _dfs(u, isVisited);
    }
}
