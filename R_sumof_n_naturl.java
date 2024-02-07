public class R_sumof_n_naturl {
    //sum of n natural number
    static int natu(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+natu(n-1);
    }
    //print n natural number
    static void nat(int n)
    {
        if(n==0)
        {
            return;
        }
        nat(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        System.out.println(natu(5));
        nat(5);
        
    }
    
}
