public class eg{
    static boolean Issorte(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Issorte(arr));
        if(Issorte(arr))
        {
            System.out.println("it is sorted");
        }
        else{
            System.out.println("is not sorted");
        }
        
    }

}