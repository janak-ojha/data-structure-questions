public class eg {
    
    
  static boolean prime(int n)
  {
    if(n==1)
    {
        return false;
    }
    
    if(n==2 || n==3)
    {
        return true;
    }
    if(n%2==0 || n%3==0)
    {
        return false;
    }
    for(int i=5;i*i<=n;i=i+6)
    {
        if(n%i==0 || n%(i+2)==0)
        {
            return false;

        }

        
    }
    return true;
  }
  static boolean pr(int n)
  {
    for(int i=0;i<=n/2;i++)
    {
        if(n%i==0)
        {
            return false;
        }
        
    }
    return true;
  }
  static boolean ipr(int n)
  {
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
  }
  static void ispreime(int n)
  {
    for( int i=2;i<=n;i++)
    {
        if(prime(i))
        {
            System.out.println(i);
        }
    }

  }
    
 
 

    public static void main(String[] args) {
        ispreime(10);
        
        
     
        
      
        

        
    }
    
}
