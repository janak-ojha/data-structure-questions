public class R_tower_of_hanoi {
    static void tower(int n,char src,char aux,char dest)
    {
        if(n==1)
        {
            System.out.println(src+"->"+dest);
            return;
        }
        tower(n-1, src, dest,aux);
        tower(1, src, aux, dest);
        tower(n-1, aux, src, dest);
    }
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
        
    }
    
}
