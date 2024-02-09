import java.util.Scanner;

public class R_palindrome {
    static boolean ispalin(String s,int i,int j)
    {
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        if(j<=i)
        {
            return true;
        }
        return ispalin(s, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         System.out.println(ispalin(s,0,s.length()-1 ));
        
        
    }
    
}
