import java.util.Scanner;

public class R_subsequenceofstring {
    static void sub( String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        
        }
        sub(s.substring(1), ans+s.charAt(0));
        sub(s.substring(1),ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        sub(s, "");
        
    }
    
}
