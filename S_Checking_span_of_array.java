public class S_Checking_span_of_array {
    static int spane(int arr[])
    {
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min)
            {
                min=arr[i];

            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int arr[]={1,3,44,55,6,77,88};
        System.out.println(spane(arr));
        
    }
    
}
