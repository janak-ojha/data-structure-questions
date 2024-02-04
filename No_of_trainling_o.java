public class No_of_trainling_o {
    public static int tril_o(int n)
    {
        return (int) (Math.log10((n&(n-1))^n)/Math.log10(2));
    }
    public static void main(String[] args) {
        System.out.println(tril_o(1000));
        
    }
    
}
