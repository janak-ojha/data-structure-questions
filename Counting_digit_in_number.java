import java.util.Scanner;

public class Counting_digit_in_number {
    public static void conut(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        conut(n);
      
    }
    
}
