public class S_painter_partion {
    static int max_time(int arr[] ,int a,int b)
    {
        int l=0,h=0;
        for(int i=0;i<arr.length;i++)
        {
            h=h+arr[i];
        }
        int res=-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(ispossible(arr,a,m)==true)
            {
                res=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
                }
                return res*b;
    }
    static boolean ispossible(int arr[],int a,int m){
        int painers=1;
        int pbc=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m){
                return false;
            }
            if(pbc+arr[i]<=m){
                pbc=pbc+arr[i];
            }
            else{
                painers++;
                if(painers>a)
                {
                    return false;
                }
                pbc=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int arr[]={10,20,30,40};
        System.out.println(max_time(arr, a, b));
    }
    
}
