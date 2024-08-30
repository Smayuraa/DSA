import java.lang.reflect.Array;
import java.util.*;
import java.util.Comparator;

public class FractionalKnapSack {

    public static void KnapSackFun(int val[],int weight[],int W)
    {
        //2D array
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=(double)val[i]/weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o-> -o[1]));
        int capacity=W;
        int finalval=0;

        for(int i=0;i<ratio.length;i++)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                finalval+=val[idx];
                capacity-=weight[idx];
            }
            else{
                finalval+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.println(finalval);
    }
    public static void main(String[]args)
    {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        KnapSackFun(val,weight,W);
    }
}
