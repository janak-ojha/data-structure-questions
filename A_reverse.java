public class A_reverse {
    static void inver(int arr[])
    {
        int b []=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int v=arr[i];
            b[v]=v;

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");

        }
        inver(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
    }
    
}
