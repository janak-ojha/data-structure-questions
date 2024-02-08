public class R_conutdigit {
    public static int finde(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return finde(n/10)+1;

    }
    public static void main(String[] args) {
       System.out.println( finde(55555));
        
        
    }
    
}
