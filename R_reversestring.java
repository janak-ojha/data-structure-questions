import java.util.Scanner;

public class R_reversestring {
    static String rev(String s,String r,int i)
    {
        if(i<0)
        {
            return r;
        }
        return rev(s, r+s.charAt(i), i-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rev(s, "", s.length()-1));
        
    }
    
}
