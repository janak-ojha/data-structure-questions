public class R_joesuphus {
    static int joe(int n,int k)
    {
        if(n==0)
        {
            return 0;
        }
        return (joe(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(joe(7, 3));
        
    }
    
}
