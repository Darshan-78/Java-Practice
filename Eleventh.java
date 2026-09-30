//most used function of string
/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s = "Hello";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(0));
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s = "Adam";
        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i)); // prints each character of string
        }
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2); // adds two strings(concatenation)
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "Hello";
        System.out.println(s1.substring(0,2)); // prints substring
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s = "Bonjour";
        char a[] = s.toCharArray();
        System.out.println(Arrays.toString(a)); // Converts string into char array
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s = "Aryan";
        String s1 = "Ayush";
        System.out.println(s.toUpperCase()); // convert string into upper case letters
        System.out.println(s1.toLowerCase()); //convert string into lower case letters
    }
} */

/* import java.util.*; //
public class Eleventh {
    public static void main(String args[]) {
        String s = "Akito";
        System.out.println(s.indexOf('i')); // tell us index of character in a string
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "Aon";
        String s2 = "Aon";
        System.out.println(s1.equals(s2)); // tells whether two strings are equal or not and returns true or false
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "Apple";
        System.out.println(s1.contains("App")); //tells whether strings contains the subpart or part of string which we want to check 
    } // it returns true or false
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "Hello,World";
        String arr[] = s1.split(","); // splits string on basis of it
        System.out.println(Arrays.toString(arr));
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        System.out.println(String.valueOf(104)); // returns string representation of values
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = " Hello Maam ";
        System.out.println(s1.trim()); // trim removes spaces in the beginning and end of a string not in middle
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s1 = "aman12";
        for(int i=0; i<s1.length(); i++) {
            char a = s1.charAt(i);

            System.out.println(a+" "+Character.isLetter(a)); // check whether char is letter or not
            System.out.println(a+" "+Character.isDigit(a));  // check whether char is digit or not
            //System.out.println(Character.toLowerCase(a)); //converts character to lower case
            System.out.println(Character.toUpperCase(a)); // converts character to upper case
        }
    }
} */

//String Builder basic functions
/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(sb.append(s1+" ").append(s2)); //it combines two strings,it modifies string
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        String s1 = "Hello";
        sb.append(s1+" ");
        sb.append("World");
        sb.append('!');
        System.out.println(sb.reverse()); //it prints reverse of string
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        String s1 = "Ballon";
        sb.append(s1);
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.deleteCharAt(2)); // it just remove one char from string at any index which we define here
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        String s1 = "Hello";
        sb.append(s1);
        System.out.println(sb.toString()); //converts string builder content into string
    }
} */

/* import java.util.*;
public class Eleventh {
    public static void main(String args[]) {
        String s = "Hello";
        String reversed ="";
        for(int i=s.length()-1; i >= 0; i--) { //reverse the string
            reversed = reversed+s.charAt(i);
        } 
        System.out.println(reversed);
    }
} */