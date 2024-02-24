public class S_min_no_of_bockey {
    static int minday(int arr[],int boq,int flower)
    {
        if(boq*flower>arr.length)
        {
            return -1;
        }
        int l=arr[0],h=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
            }
            if(arr[i]>h)
            {
                h=arr[i];

            }
        }
        int res=-1;
        
        
        while(l<=h)
        
        {
             
            int m=(l+h)/2;
            if(ispossibel(arr,boq,flower,m)==true)
            {
                res=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
            
           

        }
        return res;
       
    }
    static boolean ispossibel(int arr[],int boq ,int flower,int m)
    {
        int adj=0,bc=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=m)
            {
                adj++;
                if(adj==flower)
                {
                    bc++;
                    if(bc==boq)
                    {
                        return true;
                    }
                    adj=0;
                }
                else{
                    adj=0;
                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={2,5,2,9,3,10,4,6,5,6};
        int boq=4;
        int flower=2;
        System.out.println(minday(arr, boq, flower));
        
    }
    
    
}
