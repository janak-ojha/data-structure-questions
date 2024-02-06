import java.util.Scanner;

public class Nth_palindromic_binary_num {
    static int reverses(int n ,int len)
    {
        int f=len-1, l=0;
        int rev=0;
        while(f>l)
        {
            if((n&(1<<f))!=0)
            {
                rev=rev|(1<<l);
            }
            if((n&(1<<l))!=0)
            {
                rev=rev|(1<<f);  
            }
            f--;
            l++;
        }
        return rev;
    }
    static int nthpalin(int n)
    {
        int count=0,l=0;
        while(count<n)
        {
            l++;

            count=count+(int)Math.pow(2,(l-1)/2);

        }
        count=count-(int)Math.pow(2, (l-1)/2);
        int ele=n-count-1;
        int ans=(1<<(l-1))|(ele<<(l/2));
        ans=ans|reverses(ans, l);
        return ans;

    }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nthpalin(n));
        System.out.println(Integer.toBinaryString(nthpalin(n)));
        
    }
    
}
