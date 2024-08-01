package Arrays;

import java.util.Scanner;

public class FindKey{
    public static void myfun(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found" + " "+arr[i]);
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,8,1,0,9};
        int key=1;
        myfun(arr,key);
    }
}