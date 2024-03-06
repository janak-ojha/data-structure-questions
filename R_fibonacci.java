public class R_fibonacci {
    

        
        static void fib(int a,int b,int temp,int i,int n)
        {
            if (i==n+1)
            {
                return ;
            }
             temp=b;
             System.out.println(a);
            b=a+b;
            
            a=temp;
            fib(a, b, temp, i+1, n);
        }
    
        public static void main(String[] args) {
            fib(0, 1, 0, 1, 10);
            
        }
    }
    
    

