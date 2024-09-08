import java.util.*;
public class InsertHeap{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
       public void add(int data)
       {
        int x=arr.size()-1, par=(x-1)/2;
        
        while(arr.get(x)<=arr.get(par))
        {
            //swap
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x=par;
            par=(x-1)/2;
        }
       }
    }
    public static void main(String[]args)
    {
        Heap h=new Heap();
        h.add(1);
        h.add(2);
        h.add(3);
        // while(!h.isEmpty())
        // {
        //     System.out.println(h.peek());
        //     h.remove();
        // }
    }
}