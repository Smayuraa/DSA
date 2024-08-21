import java.util.ArrayList;

public class MaxElement {
    public static void MaxFun(ArrayList<Integer>list)
    {
        int max=Integer.MIN_VALUE;
       // int ans=0;
        for(int i=0;i<=list.size()-1;i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
             //or 
            //ans= Math.max(max, list.get(i));
        }
        System.out.println(max);
      //  System.out.println(ans);

       
    }
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(15);
        list.add(42);

        MaxFun(list);
    }
}
