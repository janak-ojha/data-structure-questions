public class A_remove_duplicate {
   public static int  removes(int arr[])
    {
        int rd=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[rd] != arr[i])
            {
                rd++;
                arr[rd]=arr[i];

            }
        }
        return rd+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,6,7,7};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
         int rd=removes(arr);
         System.out.println();
        for(int i=0;i<rd;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
