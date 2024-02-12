public class Fibonacci_series {
    static int a=1,b=1,c;
    public static void fibbo(int n)
    {
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
            
            

        }
        
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        fibbo(3);
        
    }
    
}
