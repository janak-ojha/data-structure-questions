public class eg{
    static int binary_search(int arr[],int key)
    {
        int start=0;
        int last=arr.length-1;

        while(start<=last)
        {
            int mid=(start+last)/2;
            if(key>arr[mid])
            {
                start=mid+1;
                
            }
            else if(key<arr[mid])
            {
                last=mid-1;
            }
            else if(key==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
   
 public static void main(String[] args) {
    int arr[]={1,2,3,4,9,11,15};
    int key=15;
    System.out.println("the element  "+key+" is at "+ binary_search(arr, key));
    
 }

}