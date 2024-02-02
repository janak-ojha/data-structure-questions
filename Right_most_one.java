import java.util.*;

public class Right_most_one {
    public static int righte(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                return i + 1;
            }
        }
        return -1;
    }

    public static int rmsr(int n) {
        int m = 1;
        int pos = 0;
        if (n == 0) {
            return -1;
        }
        while ((n & m) == 0) {
            m = m << 1;
            pos++;
        }
        return pos + 1;
    }

    public static int rmsde(int n) {
        return (int) (Math.log10(n & (n & (n - 1))) / Math.log10(2)) + 1;
        // Fix the typo ^ to & and add missing closing parenthesis
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int position = righte(s);
        if (position != -1) {
            System.out.println("Position of the rightmost '1' in the binary string: " + position);
        } else {
            System.out.println("There is no '1' in the binary string.");
        }

        System.out.println("Position using rmsr method: " + rmsr(n));
        System.out.println("Position using rmsde method: " + rmsde(n));
    }
}

