public class Fibonacci_series {
    static int a=1,b=1,c;
    public static void fibbo(int n)
    {
        if(n>=1)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fibbo(n-1);

        }
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        fibbo(5);
        
    }
    
}
