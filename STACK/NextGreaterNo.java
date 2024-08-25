import java.util.*;
public class NextGreaterNo {

    public static void main(String[]args)
    {
        int arr[]={6,8,0,1,3};
        int ans[]=new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans[i]= -1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);

        }

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
        System.out.println();

    }
}
