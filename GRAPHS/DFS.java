
    import java.util.*;

public class DFS {
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
            for (Edge e : graph[i]) {
                System.out.print("(" + e.src + " -> " + e.dest + ") ");
            }
            System.out.println();
        }
    }

    public static void dfsFun(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.println(curr);
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfsFun(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        printGraph(graph);

        System.out.println("DFS traversal:");
        boolean[] vis = new boolean[v];
        dfsFun(graph, 0, vis);
    }
}


