import java.util.Scanner;

public class Finding_all_prime_factor {
    public static void primes(int n)
    {
        int i=2;
        while(i*i<=n)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
            i++;
        }
        if(n>1)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primes(n);
        
    }
    
}
