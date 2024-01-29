import java.util.Scanner;

public class Finding_hcf_gcd_bruteforce {
    //bruteforceapproach
    public static int brut(int a,int b)
    {
        int min=0;
        if(a>b)
        {
            min=b;
        }
        else{
            min=a;
        }
        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return 1;

    }
    //euclidean method
    public static int eucleidean(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
           
        }
        return a;
        
    }
    //optimized euclidean algo
    public static int dis(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0)
        {
            return a;
        }
        else
        {
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(brut(a, b));
        System.out.println(eucleidean(a, b));
        System.out.println(dis(a, b));

        
    }
    
}
