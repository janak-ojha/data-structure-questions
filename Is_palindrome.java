public class Is_palindrome {
   public static boolean ispalin(String s)
    {
        int end = s.length()-1;

        for (int start = 0; start<end; start++) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="kjjk";
        System.out.println(ispalin(s));
        
        
    }
    
}
