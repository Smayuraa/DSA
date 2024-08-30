import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[]args)
    {
        Integer coins[]={1,2,5,20,50,100,200,500,2000};
        int amount=590;
        int count=0;
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=amount)
            {
               while(coins[i]<=amount)
               {
                count++;
                ans.add(coins[i]);
                amount=amount-coins[i];
               }
            }
        }
        System.out.println("total coins: "+count);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }


    }
}
