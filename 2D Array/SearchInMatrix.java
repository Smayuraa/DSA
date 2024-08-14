import java.util.*;
   
public class SearchInMatrix {
    
 
    
        public static boolean sumFun(int arr[][],int key)
        {  
            int i=0,j=arr[0].length-1;
            while(i<arr.length&&j>=0)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("found key");
                    return true;
                }
                else if(key<arr[i][j])
                {
                    j--;
                }
                else{
                    i++;
                }
            }
            System.out.println("not found");
            return false;
           
          
    
    
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the key: ");
            int key=sc.nextInt();
            int arr[][]={{1,2,3,4},{2,3,4,5},{23,65,21,4},{34,65,12,9}};
              
           
            sumFun(arr,key);
        } 
    }
    

