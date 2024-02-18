public class S_coubntingsamll_equal {
    //it there are no duplicate
    static int countsm(int arr[] , int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while (l<=h) {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                break;
            }
             else if(key<arr[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return mid+1;

    }
    static int duplicountsm(int arr[] , int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while (l<=h) {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                while ((mid+1)<arr.length && arr[mid+1]==key) {

                    mid++;
                    
                }
                break;
            }
             else if(key<arr[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return mid+1;

    }
    //value doesnit exist in array
    static int valuenotcountsm(int arr[] ,int key)
    {
        int l=0,h=arr.length-1,mid=0;
        while (l<=h) {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                while (mid+1<arr.length && arr[mid+1]==key) {
                    mid++;
                    
                }
                break;
            }
             else if(key<arr[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        if(arr[mid]>key)
        {
            return mid;
        }
        else{
            return mid+1;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]={1,2,3,4,8,12,12};
        int arr2[]={1,2,3,4,5,7,12};
System.out.println(duplicountsm(arr1,6));
System.out.println(valuenotcountsm(arr2, 12));
System.out.println(countsm(arr, 6));
        
    }
    
}
