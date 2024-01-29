import java.util.Scanner;

public class Factorial_of_num {
    public static long facto(int n)
    { int res=1;
        for(int i=1;i<=n;i++)
        {
            
            res=i*res;
            
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(facto(n));
    }
    
}
