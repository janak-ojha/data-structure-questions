public class S_element_rotated_array_sorted {
    static int rotate(int arr[] , int key){
        int l=0,h=arr.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(arr[l]<=arr[mid])
            {
                if(key>=arr[l] && key<arr[mid])
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[h])
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};
        int key=4;
        System.out.println(rotate(arr, key));
        
    }
    
}
