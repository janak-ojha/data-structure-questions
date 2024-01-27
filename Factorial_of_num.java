import java.util.Scanner;

public class Factorial_of_num {
    public static void facto(int n)
    { int res=1;
        for(int i=1;i<=n;i++)
        {
            
            res=i*res;
            
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        facto(n);
    }
    
}
