import java.util.ArrayList;

public class CreateGraph{
    public static class Edge{
     int src,dest;
     public Edge(int s,int d)
     {
     this.src=s;
     this.dest=d;
     }
    }
    public static void create(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
         graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2 ));
        graph[1].add(new Edge(1, 2 ));
        graph[2].add(new Edge(2, 3 ));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0 ));
        graph[3].add(new Edge(3, 2 ));
        graph[3].add(new Edge(3, 1 ));


    }
    public static void main(String[]args)
    {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
        create(graph);
        for(int i=0;i<graph[0].size();i++)
        {
          Edge e=graph[0].get(i);
          System.out.println(e.dest);
        }
        // loop for every index
    }
}