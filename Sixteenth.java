/* public class Sixteenth {
    public static void main(String args[]) {
        int n = 1234;
        int rev = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev = rev*10+lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
} */

/* import java.util.*;
public class Sixteenth {
public static  boolean checkPrime(int n) {
    if(n <= 1) {
        return false;
    }

    for(int i=2; i<=Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String args[]) {
        int n = 23;
        System.out.println(checkPrime(n));
    }
} */

/* public class Sixteenth {
    public static void main(String args[]) {
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<n; i++) {
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
} */

/* public class Sixteenth {
    public static int result(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int ans = 1;
        for(int i=2; i<=n; i++) {
             ans = ans*i;
        }
        return ans;
    }
    public static void main(String args[]) {
     int n = 5;
        System.out.println(result(n));
    }
} */

/* public class Sixteenth {
    public static void main(String args[]) {
        int n = 121;
        int original = n;
        int rev = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev = rev*10+lastDigit;
            n = n / 10;
        }
        if(rev == original) {
            System.out.println("Yes Palindrome");
        }
        else {
            System.out.println("No palindrome");
        }
    }
}  */