import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Lonely_integer {
    public static int Lonely(int [] arr)
    { Arrays.sort(arr);
        for(int i=0;i<=arr.length-2;i=i+2)
        {
            if(arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static int lo(int [] arr)
    {
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i:arr)
        {
            if(s.contains(i))
            {
                s.remove(i);
            }
            else{
                s.add(i);
            }
        }
        
        for(int i:s)
        {
            return i;
        }
        return -1;

    }
    public static int lon(int [] arr)
    {
        int result=0;
        for(int i:arr)
        {
            result=result^i;
        }
        return result;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int arr[]={2,2,5,5,3};
          System.out.println(lo(arr));
          System.out.println(Lonely(arr));
          System.out.println(lon(arr));

         
        
        
    }
    
}
