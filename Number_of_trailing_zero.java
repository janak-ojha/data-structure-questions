import java.util.Scanner;

public class Number_of_trailing_zero {
    public static int traillingzero(int num)
    {   int res=0;
        int powerof5=5;
        while (num>=powerof5) {
            res=res+(num/powerof5) ;
            powerof5=5*powerof5;
        
            
        }
        return res;
    }
    
    
   
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(traillingzero(num));
        
      
    
}
}
