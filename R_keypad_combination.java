import java.util.Scanner;

public class R_keypad_combination {
    static String [] keypad={" "," ","abc","def","ghi","jkl","mno","pgrs","tuv","wxyx"};
    static void Possiblecomb(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
       String key=keypad[s.charAt(0)-48];
       for(int i=0;i<=key.length()-1;i++)
       {
        Possiblecomb(s.substring(1),ans+key.charAt(i));
        
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Possiblecomb(s, "");
        
    }
    
}
