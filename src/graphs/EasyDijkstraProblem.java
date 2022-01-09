package graphs;

import java.util.Scanner;

public class EasyDijkstraProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            WeightedGraph g = new WeightedGraph(n);
            while (e-- > 0) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                g.addEdge(--u, --v, w);
            }

            int u = sc.nextInt();
            int v = sc.nextInt();
            int ans = g.dijkstra(--u, --v);
            String stringAns = (ans != -1 && ans != Integer.MAX_VALUE) ? Integer.toString(ans) : "NO";
            System.out.println(stringAns);
        }
    }
}
