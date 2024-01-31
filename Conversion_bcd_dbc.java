import java.util.Scanner;

public class Conversion_bcd_dbc {
    public static String DCB(int n)
    {   String s="";
        while(n>=1)
        {
            int x=n%2;
            n=n/2;
            s=x+s;

        }
        return s;

    }
    public static int BCD(String b){
        int res=0;
        int powerof2=1;
        for(int i=b.length()-1;i>=0;i--)
        {
            if(b.charAt(i)=='1')
            {
                res=res+powerof2;
            }
            powerof2=powerof2*2;
            
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String b=DCB(n);
        System.out.println(b);
        System.out.println(BCD(b));
        
        
    }
    
}
