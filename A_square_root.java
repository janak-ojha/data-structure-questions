public class A_square_root {
    static int finde(int n)
    {
        if(n==0  || n==1)
        {
            return n;
        }
        int l=0;
        int h=n/2;
        int res=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(m*m==n)
            {
                return m;
            }
            else if(m*m>n)
            {
                h=m-1;
            }
            else{
                l=m+1;
                res=m;
            }
        }
        return res;
    }
   
    public static void main(String[] args) {
        System.out.println(finde(18));
        
    }
    
}
