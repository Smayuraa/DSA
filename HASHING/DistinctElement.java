import java.util.HashSet;

public class DistinctElement {
    public static void main(String[]args)
    {
        int no[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<no.length;i++)
        {
            set.add(no[i]);
        }
        System.out.println(set.size());
    }
}
