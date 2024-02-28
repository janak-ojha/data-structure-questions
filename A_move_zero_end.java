public class A_move_zero_end {
    static void moves(int arr[])
    {
        int nz=arr[0];
        int n=arr[0];
        while (nz<arr.length) {
            if(arr[nz] != 0)
            {
                int temp=arr[nz];
                arr[nz]=arr[n];
                arr[n]=temp;
                nz++;
                n++;
            }
            else{
                nz++;
            }
            
        }
    }
   
    public static void main(String[] args) {
        int arr[]={1,0,2,4,0,3,0,0};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        moves(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
