import java.util.Scanner;

public class Check_si_powerof2 {
    public static boolean istwo(String n)
    {
        int count=0;
        for(int i=0;i<=n.length()-1;i++)
        {
            if(n.charAt(i)=='1')
            {
                count++;
            }
      
        }
          if(count==1)
        {
            return true;
        }
         else{
            return false;
        }
    }
    public static boolean is(int s)
    {
        if(s==0)
        {
            return false;
        }
        else{
        
         return (s&(s-1))==0;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int s=sc.nextInt();
        System.out.println(is(s));
        System.out.println(istwo(n));
    }
    
}
