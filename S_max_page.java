public class S_max_page {
    static int max_page(int [] arr,int b)
    {
        if(b>arr.length)
        {
            return -1;
        }
        int l=arr[0],h=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<l)
            {
                l=arr[i];
            }
            h=h+arr[i];
        }
        int res=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(ispossible(arr,m,b)==true)
            {
                res=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
    static boolean ispossible(int arr[],int m,int b)
    {
        int student=1;
        int spc=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m)
            {
                return false;
            }
            if(spc+arr[i]<=m)
            {
                spc=spc+arr[i];
            }
            else{
                student++;
                if(student>b)
                {
                    return false;
                }
                spc=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int b=2;
        System.out.println(max_page(arr, b));
    }
    
}
