public class R_cuttin_rop {
    static int ropecut(int n,int a,int b,int  c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }
         int  temp1=ropecut(n-a, a, b, c);
         int temp2=ropecut(n-b, a, b, c);
         int temp3=ropecut(n-c, a, b, c);
         int pieces=Math.max(temp1, Math.min(temp2, temp3));
         if(pieces==-1)
         {
            return -1;
         }
         return pieces+1;
    }
    public static void main(String[] args) {
        
    }
    
}
