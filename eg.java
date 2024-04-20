public class eg{

   
  static int a=1;
  static int b=1;
  static int c;
   static void fibonacci(int n)
   {
      for(int i=0;i<=n;i++)
      {
         c=a+b;
         System.out.print(c+" ");
         a=b;
         b=c;
      }
      

   }
    
  
   
 public static void main(String[] args) {
   System.out.print(a+" ");
   System.out.print(b+" ");
fibonacci(5);
    
 }

}