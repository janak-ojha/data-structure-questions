import java.util.Scanner;

public class FInding_lcm {
    //normal brute force apporach
    public static int lcm(int a,int b)
    {
        int res=0;
        if(a>b)
        {
            res=a;
        }
        else
        {
            res=b;
        }
        while(true)
        {
            if(res%a==0 && res%b==0)
            {
                break;
            }
            res++;
        }
        return res;
    }

    //by euclidean approach
    public static int findelcm(int a,int b)
    {
        return (a*b)/ecuclideanhcfgcd(a,b);
    }
    public static int ecuclideanhcfgcd(int a,int b)
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
        System.out.println(lcm(a, b));
        System.out.println(findelcm(a, b));

        
    }
    
}
