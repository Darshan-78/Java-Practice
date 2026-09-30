/* import java.util.*; // string length
public class Fifth {
    public static void main(String args[]) {
        String s1 = "Ash Ketchum";
        System.out.println(s1.length());
    }
} */

/* import java.util.*; // input output in string
public class Fifth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
} */

/* import java.util.*;
public class Fifth {
    public static void main(String args[]) {
        String s1 = "Ash";
        String s2 = "Ketchum";
        String s3 = s1 +" " +  s2;
        System.out.println(s3);
    }
} */

/*import java.util.*;
public class Fifth {
    public static void Letters(String s1) {
        for(int i=0; i<s1.length(); i++) {
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String s1 = "Aryan";
        Letters(s1);
        }
    } */

import java.util.*;
public class Fifth {
    public static void reverse(char s[]) {
        int start = 0;
        int end = s.length-1;
        char a ;
        while(start < end) {
            a = s[start];
            s[start] = s[end];
            s[end] = a;

            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        char s[] = {'h','e','l','l','o'};
        reverse(s);

        for(int i=0; i<s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
} 