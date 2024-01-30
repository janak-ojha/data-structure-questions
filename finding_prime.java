public class finding_prime {
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2||n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
            

        }
        return true;
        

    }
    public static boolean isp(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;

    }

    public static boolean ispre(int n)
    {
        for(int i=2;i*i<=n;i++)


        {
            if(n%i==0)
            {
                return false;
            }


        }
        return true;
    }
    //simple approach
    public static void primenum(int n)
    {
        for(int i=2;i<=n;i++)
        {

        
        if(isprime(i))
        {
            System.out.println(i);

        }
    }
    }
    public static void seiveprime(int n)
    {
        boolean [] prime=new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                for(int j=i*2;j<=n;j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                System.out.println(i);
            }
        }
    }
        
    
    public static void main(String[] args) {
        int n=53;
        System.out.println(isprime(n));
        System.out.println(isp(n));
        System.out.println(ispre(n));
        primenum(n);
        seiveprime(n);
    }
}
