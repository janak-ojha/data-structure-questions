public class R_sum_of_array {
    static int sum(int arr[] ,int i)
    {
        if(i==arr.length)
        {
            return 0;
        }
        return sum(arr, i+1)+arr[i];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sum(arr, 0));
        
    }
    
}
