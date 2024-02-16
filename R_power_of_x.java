public class R_power_of_x {
    static long pow(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        return pow(x, y-1)*x;
    }

    //efficrent
    static long poe(int x,int y)
    {
        if(y==0)
        {
            return 1;
        }
        if(y%2==0)
        {
            long res=poe(x, y/2);
            return res*res;
        }
        return poe(x, y-1)*x;
    }
    public static void main(String[] args) {
        System.out.println(pow(5,3));
        System.out.println(poe(2, 4));
        
    }
    
}
