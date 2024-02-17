public class S_second_largest_ele {
    static int sl(int arr[])
    {
        int max1=0,max2=0;
        if(arr[0]>arr[1])
        {
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max1=arr[1];
            max2=arr[0];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        
        return max2;

    }
    static int secondsmallest(int arr[])
    { int min1=0,min2=0;
        if(arr[0]>arr[1])
        {
            min1=arr[1];
            min2=arr[0];
        }
        else{
            min1=arr[0];
            min2=arr[1];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[1];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        int arr[]={22,33,11,44,34,67};
        System.out.println(sl(arr));
        System.out.println(secondsmallest(arr));
        
    }
    
}
