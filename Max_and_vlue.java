public class Max_and_vlue {
    public static int max(int arr[])
    {
        int res=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if((arr[i]&arr[j])>res)
                {
                    res=arr[i]&arr[j];
                }
            }
        }
        return res;
    }
    

    public static int checknbit(int arr[] ,int mask)
    {
        int count=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if((mask&arr[i])==mask)
            {
                count++;
            }

        }
        return count;
    }
    public static int maxvl(int [] arr)
    {
        int mask=0;
        int res=0;
        for(int i=32;i>=1;i--)
        {
            mask=(1<<i)|res;
            int count=checknbit(arr, mask);
            if(count >= 2)
            {
                res=res|mask;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={16,8,9,13};
        System.out.println(max(arr));
        System.out.println(maxvl(arr));
        
    }
    
}
