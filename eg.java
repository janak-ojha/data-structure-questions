public class eg {
    static boolean ispaline(String arr)
    {
       int  l=arr.length()-1;
       for(int s=0;s<l;s++)
       {
        if(arr.charAt(s)!=arr.charAt(l))
        {
            return false;
        }
        l--;
       }
       return true;
       
      
       
          
          
    }
   static String revers(String arr)
   {
    char[] charArray=arr.toCharArray();
    int a=0;
    int b=arr.length()-1;
    while (a<b) {
        char temp=charArray[a];
        charArray[a]=charArray[b];
        charArray[b]=temp;
        a++;
        b--;
        

        
    }
    return new String(charArray);
   
    
   }

    
    
  


  

    
    
 
 
 

    public static void main(String[] args) {
       
       String arr="janak";
       System.out.println(ispaline(arr));
       System.out.println(revers(arr));
       
        

       
        
        
     
        
      
        

        
    }
    
}
