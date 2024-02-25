public class A_check_sot {
    static boolean issort(int arr[]){
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
        int arr[]={1,2,3,5,7,9};
        System.out.println(issort(arr));
        if(issort(arr))
        {
            System.out.println("it is sorted");
        }
        else{
            System.out.println("not sorted");
        }
        
    }
    
}
