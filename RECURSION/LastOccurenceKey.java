//find first occurence of an element in an array
public class LastOccurenceKey {
    public static int Findkey(int arr[],int i,int key)
    {
    if(i==arr.length)
    {
        return -1;
    }
    int lastIdx= Findkey(arr, i+1, key);
    if(lastIdx==-1&&arr[i]==key)
    {
        return i;
    }
    return lastIdx;
  
        
    }
    public static void main(String[]args)
    {
        int arr[]={10,15,30,40,15,6};
       System.out.println("found at index : "+Findkey(arr,0,15));//i=0
    }
}
