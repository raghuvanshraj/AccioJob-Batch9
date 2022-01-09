package graphs;

import java.util.Scanner;

public class DFSImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(n);
        while (e-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }

        g.dfs(0);
    }
}
