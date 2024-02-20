public class S_wood_cutiing_pro {
    static int countwd(int ht[] ,int mid)
    {
        int wc=0;
        for(int i=0;i<ht.length;i++)
        {
            if(ht[i]>mid)
            {
                wc=wc+ht[i]-mid;
            }
        }
        return wc;
    }
    static int machinht(int ht[],int b)
    {
        int max=0;
        for(int i=0;i<ht.length;i++)
        {
            if(ht[i]>max)
            {
                max=ht[i];
            }
        }
        int l=0,h=max,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            int wc=countwd(ht,mid);
            if(wc==b || l==mid)
            {
                return wc;
            }
            else if(wc>b)
            {
                l=mid;
            }
            else{
                h=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ht[]={20,15,12,14};
        int b=8;
        System.out.println(machinht(ht, b));
        
    }
    
}
