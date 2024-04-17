public class eg{
    static int linear_search(int arr[],int key)
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
    int arr[]={1,3,2,5,4};
    int key=5;
    System.out.println( "element "+key+" is found at index:"+linear_search(arr, key));
    
 }

}