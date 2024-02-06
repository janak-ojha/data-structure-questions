import java.util.HashSet;
import java.util.Scanner;

public class Unique_char {
    public static char firstNonRepeatingCharacter(String s) {
        
        HashSet<Character> S = new HashSet<>();

        for (char c : s.toCharArray()) {
            if ( S.contains(c)) {
                 S.remove(c);
            } else {
                   S.add(c);
                
            }
        }

        for (char c : s.toCharArray()) {
            if (S.contains(c)) {
                return c;
            }
        }

        return '\0';
    }
    public static void efficentway(String s){
        int count[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] == 1){
                System.out.println((char)(i) + "->" + count[i]);
            }
        }
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println( firstNonRepeatingCharacter(s));
        efficentway(s);

        
    }
}
