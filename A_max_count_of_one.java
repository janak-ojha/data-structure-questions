public class A_max_count_of_one {
    static int max_co(int arr[])
    {  int maxconut=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            {
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[j]==1)
                    {
                        count++;
                    }
                    else{
                        break;
                    }
                    if(count>maxconut)
                    {
                        maxconut=count;
                    }
                }

            }
           
        }
        return maxconut;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1,1,1,1,0};
        System.out.println(max_co(arr));
        
    }
    
}
