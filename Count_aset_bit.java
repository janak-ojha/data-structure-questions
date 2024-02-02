import java.util.Scanner;

public class Count_aset_bit {
    //o(logn) inboth
    public static int count(String n)
    {
        int count=0;
        for(int i=n.length()-1;i>=0;i--)
        {
            if(n.charAt(i)=='1')
            count++;
        }
        return count;
        
        
    }
    public static int countone(int s)
    {
        int count=0;
        while(s>0)
        {
            s=s&(s-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(count(s));
        System.out.println(countone(n));

        
    }
    
}
