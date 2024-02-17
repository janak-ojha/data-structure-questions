public class S_ceil_floor_ {
    static int ceil(int arr[],int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return arr[mid];
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
               h=mid-1;
            }
            
        }
        return arr[l];
    }
    
    static int floor(int arr[],int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return key;
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return arr[h];
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,66,88};
        int key=68;
        System.out.println(ceil(arr, key));
        System.out.println(floor(arr, key));
        
    }
    
}
