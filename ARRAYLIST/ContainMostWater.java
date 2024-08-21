import java.util.ArrayList;
public class ContainMostWater{

public static int MostWaterFun(ArrayList<Integer>list)
 {
    int max=0;
    for(int i=0;i<list.size();i++)
    {
        for(int j=i+1;j<list.size();j++)
        {
           int height= Math.min(list.get(i), list.get(j));
           int wt=j-i;
           int curr=height*wt;
            max=Math.max(curr,max);
        }
    }
    return max;
 }
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);



       System.out.println( MostWaterFun(list));
    }
}
