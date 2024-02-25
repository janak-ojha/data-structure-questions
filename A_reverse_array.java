public class A_reverse_array {
    static void reverses(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

        reverses(arr);
        System.out.println();
   
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        
    }
    
}
