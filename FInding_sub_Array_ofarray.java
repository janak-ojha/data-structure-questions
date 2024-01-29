public class FInding_sub_Array_ofarray {
    public static void subar(int n[])
    {
        for(int i=1;i<n.length;i++)
        {
            for(int j=i;j<n.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        subar(n);
        
    }
    
}
