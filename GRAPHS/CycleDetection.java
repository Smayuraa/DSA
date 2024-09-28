import java.util.*;
public class CycleDetection {
    public static class Edge{
        int src,dest;
        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void Creategraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));
    }

    public static boolean isCycle(ArrayList<Edge>graph[],boolean vis[],boolean stack[],int curr )
    {
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(stack[e.dest])
            {
                return true;
            }
            else if(!vis[e.dest]&& isCycle(graph, vis, stack, e.dest))
            {
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static void main(String[]args)
    {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
        Creategraph(graph);
        boolean vis[]=new boolean[v];
        boolean stack[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!vis[i])
            {
                if(isCycle(graph,vis,stack,i))
                {
                    System.out.println("Cycle found");
                    break;
                }
            }
            System.out.println("Cycle not found");

        }
    }
}
