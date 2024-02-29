public class eg {
    
    static int remove(int arr[])
    {
        int id=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[id]!=arr[i])
            {
                id++;
                arr[id]=arr[i];

            }
            
           
            
        }
        return id+1;
       
       

    }

    
    
 
 
 

    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,5,6};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int id=remove(arr);
        for(int i=0;i<id;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
        
        
     
        
      
        

        
    }
    
}
