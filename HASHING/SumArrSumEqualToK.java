import java.util.HashMap;

public class SumArrSumEqualToK {
    public static void main(String[]args)
    {
        int arr[]={10,2,-2,-20,10};
        int sum,ans,k;
        sum=0;ans=0;k=-10;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);

    }
}
