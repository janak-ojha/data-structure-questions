public class S_fi_first_last_idx_ele_in_sort_arr {
    static int[] findidx(int arr[],int key)
    {
        int l=0,h=arr.length-1 ,mid=0;
        int res []={-1,-1};
        while(l<=h)
        {

            mid=(l+h)/2;
            if(key==arr[mid])
            {
                
                res[0]=mid;
                h=mid-1;
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        l=0;
        h=arr.length-1;
        mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                res[1]=mid;
                l=mid+1;
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args)
     {
        int arr[] = { 3, 4, 4, 4, 4, 4, 4, 5, 6 };
        int key = 4;
        int result[] = findidx(arr, key);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
        
       
    }
    
}
