import java.util.*;

public class BFS {
    public static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));
    }

    public static void printGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Edges from vertex " + i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print("(" + e.src + " -> " + e.dest + ") ");
            }
            System.out.println();
        }
    }

    public static void bfsFun(ArrayList<Edge>[] graph, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr);

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        printGraph(graph);

        System.out.println("BFS traversal:");
        bfsFun(graph, v);
    }
}
