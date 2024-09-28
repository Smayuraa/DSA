public class CreationOfST{
    static int tree[];
    public static void init(int n)
    {
        tree=new int[4*n];
    }
    public static int BuildST(int arr[],int i,int start,int end)
    {

        if(start==end)
        {
            tree[i]=arr[start];
            return arr[start];

        }
        int mid = (start + end) / 2;

        int left = BuildST(arr, 2*i+1, start, mid);
        int right=BuildST(arr, 2*i+2, mid+1, end) ;

        tree[i]=left+right;
        return tree[i];
     }
     public static void main(String[]args)
     {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        BuildST(arr, 0, 0, n-1);
        for(int i=0;i<2*n-1;i++)
        {
            System.out.print(tree[i]+ " ");
        }
     }
}