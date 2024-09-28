import java.util.*;
public class DijkstraAlgo {
    public static class Edge{
        int src,dest,wt;
        public Edge(int s,int d,int wt)
        {
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static class Pair implements Comparable<Pair>
    {
        int node,dist;
        public Pair(int n,int d)
        {
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.dist-p2.dist;
        }
      
    }

    public static void CreateGraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
          
        graph[0].add(new Edge(0, 2,1));
        graph[1].add(new Edge(1, 2,2));
        graph[2].add(new Edge(2, 3,3));
        graph[2].add(new Edge(2, 1,1));
        graph[2].add(new Edge(2, 0,4));
        graph[3].add(new Edge(3, 2,2));
        graph[3].add(new Edge(3, 1,2));

    }
   
    public static void Dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];
    
        // Initialize distance array
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0; 
    
        pq.add(new Pair(src, 0));  
    
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
    
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
    
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;  // Update distance
                        pq.add(new Pair(v, dist[v]));  // Add the updated pair to the queue
                    }
                }
            }
        }
    
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from source to " + i + " is " + dist[i]);
        }
    }
    
 public static void main(String[]args)
 {
    int v=9;
    ArrayList<Edge>graph[]=new ArrayList[v];
    CreateGraph(graph);
   
    Dijkstra(graph,0,v);
 }
  
}
