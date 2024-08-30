import java.util.ArrayList;

public class ActivitySelection{

    public static void ActivitySelectionFun(int start[],int end[])
    {
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        int lastend=end[0];
        int max=1;
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=lastend)
            {
              max++;
              ans.add(i);
              lastend=end[i];
            }
        }
        System.out.println("total activity: " +max);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A " +ans.get(i));
        }
    }
    public static void main(String[]args)
    {
        int start[]={10,12,20};
        int end[]={20,25,30};
        ActivitySelectionFun(start,end);
    
    
    }
}