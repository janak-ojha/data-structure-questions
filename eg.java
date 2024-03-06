public class eg {
    
  

  static void fibbo(int n){
    int a=0;
    
    int b=1;
    
    for(int i=0;i<=n;i++)
    {    
        System.out.println(a);
         int  c=a+b;
        
         a=b;
         b=c;
         


    }
  }

  static int fibboe(int n) {
    if (n == 0) {
        return 0;
    }

    if (n == 1 || n == 2) {
        return 1;
    }

    return fibboe(n - 1) + fibboe(n - 2);
}



  

    
    
 
 
 

    public static void main(String[] args) {
       int n=5;
    
        

        System.out.println(fibboe(n));
        
        
     
        
      
        

        
    }
    
}
