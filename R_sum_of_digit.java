public class R_sum_of_digit {
    static int sumdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return sumdigit(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sumdigit(5555));
        
    }
    
}
