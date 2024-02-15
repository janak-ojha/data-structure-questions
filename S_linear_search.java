public class S_linear_search {
    static int linear(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={22,44,33,55,11};
        int key=11;
        System.out.println(linear(arr, key));
        
    }
    
}
