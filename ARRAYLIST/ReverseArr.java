import java.util.ArrayList;

public class ReverseArr{

    public static void ReverseFun(ArrayList<Integer> list)
    {
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i)+" ");
        }
    }
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ReverseFun(list);
    }
}