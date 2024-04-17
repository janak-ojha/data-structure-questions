public class eg{
    static int binary_search(int arr[],int key,int low,int high)
    {
        if(low <= high)
        {
            int mid = (low+high)/1;
        
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            return binary_search(arr, key, mid+1, high);
        }
        else{
            return binary_search(arr, key, low, mid-1);
        }
    }
    return -1;
}
   
 public static void main(String[] args) {
    int arr[]={1,2,3,4,9,11,15};
    int key=15;
    System.out.println("the element  "+key+" is at "+ binary_search(arr, key, 0, arr.length-1));
    
 }

}