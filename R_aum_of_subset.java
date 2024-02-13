public class R_aum_of_subset {
    static int subset_sum(int arr[],int sum,int i)
    {
        if(sum==0)
        {
            return 1;
        }
        if(sum<0)
        {
            return 0;
        }
        if(i==arr.length)
        {
            return 0;
        }
        return subset_sum(arr, sum-arr[i], i+1)+subset_sum(arr, sum, i+1);
    }
    public static void main(String[] args) {
        int arr[]={20,10,5,15};
        System.out.println(subset_sum(arr, 25, 0));
        
    }
    
}
