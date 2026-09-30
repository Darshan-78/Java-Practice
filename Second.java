/* import java.util.*;
public class Second {
    public static void main(String args[]) {
        int n = 4;
        for(int i=1; i<=n; i++){
            System.out.print(" ");
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                }
                 else {
                    System.out.print(0+" ");
                 }
            }
            System.out.println();
        }
    }
} */

/*public class Second {
    public static void hollow_NumberPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=i; s++) {
                if(i==s|| i==n|| s==1) {
                System.out.print(s+" ");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_NumberPattern(5);
    }
} */

/* public class Second{
    public static void main(String args[]) {
        int n = 8324;
        int reverse = 0;
        while(n > 0) {
        int lastDigit = n % 10;
        reverse = reverse*10+lastDigit;
        n = n/10; 
    }
    System.out.println(reverse);
}
} */

/* import java.util.*;
public class Second {
    public static void DecTobin(int n) {
        int bin = 0;
        int power = 0;
        while(n > 0) {
            int rem = n % 2;
            bin = bin+(rem*(int)Math.pow(10,power));
            n =  n/2;
            power++;
        }
        System.out.println(bin);
    }
    public static void main(String args[]) {
        int n = 14;
        DecTobin(n);
    }
} */

/* import java.util.*;    
public class Second {
    public static void binToDec(int n) {
        int dec = 0;
        int power = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            dec = dec+(lastDigit*(int)Math.pow(2, power));
            power++;
            n = n/10;
        }
        System.out.println(dec);
    }
    public static void main(String args[]) {
        int n = 1110;
        binToDec(n);
    }
} */

/* import java.util.*;
public class Second {
    public static void checkString(String s1) {
        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--) {
            char ch = s1.charAt(i);
            s2 = s2 + ch;
        }
        System.out.println(s2);
            if(s2.equals(s1)) {
                System.out.println("String is palindrome");
            }
            else{
                System.out.println("String is not palindrome");
            }
        }
    public static void main(String args[]) {
        String s1 = "racecar";
        checkString(s1);
    }
} */

/* import java.util.*;
public class Second {
    public static void countVowel(String s1) {
        String s2 = "aeiouAEIOU";
        int count = 0;
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);

            if(s2.indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]) {
        String s1 = "tiger";
        countVowel(s1);
    }
} */


public class Second {
    public static void Armstrong(int n) {
       int original = n;
        int temp = n;
        int count = 0;

        while(temp > 0) {
            temp = temp/10;
            count++;
        }
        int temp2 = n;
        int sum = 0;
        while(temp2 > 0) {
            int digit = temp2 % 10;
            int power = 1;
            for(int i=1; i<=count; i++) {
                power = digit*power;
            }
            sum = sum + power;
            temp2 = temp2/10;
        }
        if(sum == original) {
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }
    }
    public static void main(String args[]) {
        int n = 153;
        Armstrong(n);
    }
}