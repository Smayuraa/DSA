import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPair {
    public static void main(String[]args)
    {
        int pair[][]={{5,24},{39,60},{5,28},{27,48},{50,90}};
        //sort
        Arrays.sort(pair,Comparator.comparingDouble(o-> o[1]));
        int ans=1;
        int end=pair[0][1];
        for(int i=0;i<pair.length;i++)
        {
            if(pair[i][0]>=end)
            {
                ans++;
                end=pair[i][1];
            }
        }
        System.out.println("max length chain pair is : "+ans);
    }
    
}
