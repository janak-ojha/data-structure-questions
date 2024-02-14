public class R_lucky_num {
    static boolean luvk(int n,int counter)
    {
        if(n<counter)
        {
            return true;
        }
        if(n%counter==0)
        {
            return false;
        }
        return luvk(n-(n/counter), counter+1);
    }
    public static void main(String[] args) {
        System.out.println(luvk(13, 2));
        
    }
    
}
