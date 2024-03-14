public class A_max_sum_subarray {
    static int subar(int arr[])
    {
        int maxsum=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
        }
        return maxsum;
    }
    static int maxs(int arr[])
    {
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(sum>=0)
            {
                sum=sum+arr[i];
            }
            else{
                sum=arr[i];
            }
            if(sum>maxsum)
            {
                maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-1,3,4,-2};
        System.out.println(subar(arr));
        System.out.println(maxs(arr));
        System.out.println("the values is the"+maxs(arr));
        
    }
    
}
