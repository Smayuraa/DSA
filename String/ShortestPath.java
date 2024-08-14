package String;

public class ShortestPath {
   public static void main(String[]args)
   {
    int x=0,y=0;
    String dire="WNEENESENNN";
    for(int i=0;i<dire.length();i++)
    {
        char dest=dire.charAt(i);
        if(dest=='E')
        {
            x++;
        }
        else if(dest=='W')
        {
            x--;
        }
        else if(dest=='N')
        {
            y++;
        }
        else{
            y--;
        }
    }
    int x2=x*x;
    int y2=y*y;
  double ans= Math.sqrt(x2+y2);
  System.out.println("Shortest Path: "+ans);
   }
}
