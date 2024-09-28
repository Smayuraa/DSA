import java.util.*;

public class UndirectedCycle {

    public static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void Creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
    }

    public static boolean cycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] && e.dest != par) {
                return true;  // Cycle detected
            } else if (!vis[e.dest]) {
                if (cycleUndirected(graph, vis, e.dest, curr)) {  
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        Creategraph(graph);
        boolean vis[] = new boolean[v];
        
        boolean hasCycle = false;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (cycleUndirected(graph, vis, i, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Cycle present: " + hasCycle);
    }
}
