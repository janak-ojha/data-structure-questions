public class S_bitonic_Array {
    static int asebs(int arr[],int key,int value)
    {
        int l=0,h=value,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    static int desbs(int arr[],int key,int value)
    {
        int l=value,h=arr.length-1,mid=0;
        while (l<=h) {
            mid=(l+h)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return -1;
    }
    static int findbitonicindex(int arr[])
    {
        int l=0,r=arr.length-1,mid=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                l=mid;
            }
            else
            {
                r=mid;
            }
        }
        return -1;
    }
    static int search_bitonic(int arr[],int key,int bindex){

    
    if(key==arr[bindex]){
        return bindex;

    }
    if(key>arr[bindex])
    {
        return -1;
    }
    int res1=asebs(arr, key, bindex);
    if(res1 != -1)
    {
        return res1;
    }
    int res2=desbs(arr, key, bindex);
    if(res2 != -1){
        return res2;
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={6,7,8,9,10,3,2,1};
        int b=8;
         int bindex= findbitonicindex(arr);
         System.out.println(search_bitonic(arr, b, bindex));

        
    }
    
}
