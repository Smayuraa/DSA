import java.util.*;

public class TopologicalSort {

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

    public static void TopSort(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> stack, int curr) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                TopSort(graph, vis, stack, e.dest);
            }
        }
        stack.push(curr);  // Push after all adjacent nodes are processed
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        Creategraph(graph);
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                TopSort(graph, vis, stack, i);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
