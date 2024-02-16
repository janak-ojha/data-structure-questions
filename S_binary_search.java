public class S_binary_search {
    static int bs(int arr[],int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while (l<=h) {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,66,77,88};
        int key=77;
        System.out.println(bs(arr, key));
    }
    
}
