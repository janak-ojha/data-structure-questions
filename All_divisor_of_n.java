import java.util.Scanner;

public class All_divisor_of_n {
    //normal method
    public static void dicisor(int n)
    {
        for(int i=1;i<=n;i++)
        {
        if(n%i==0)
        {
            System.out.println(i);
        }
        }
    }
    public static void divde(int n)
    {
        int i;
        for( i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("the value si"i);
            }
        }
        for(int j=i;j<=n;j++)
        {
            if(n%j==0 || j==n/j)
            {
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dicisor(n);
        divde(n);
        
    }
    
}
