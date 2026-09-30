/*import java.util.*;
public class Third {
   public static int calcdivide(int a, int b) { // divide 2 numbers
       int div = a/b;
      return div;
   }
   public static void swap(int a,int b) { //swap number
      int temp = a;
      a = b;
      b = temp;
   }
   public static void main(String args[]) {
      int a = 4;
      int b = 2;
      int result = calcdivide(a,b);
      System.out.println(result);
      result = calcdivide(20,5);
      System.out.println(result);
      //swap(a, b);
      //System.out.println("a = " + a);
      //System.out.println("b = "+ b);
   }
} */


//Find factorial
/* import java.util.*;
public class Third{
   public static int Factorial(int n) {
      int fact = 1;
      for(int i=1; i<=n; i++) {
         fact = fact*i;
      }
      return fact;
   }
   public static void main(String args[]) {
      System.out.println(Factorial(5));
   }
} */

//add two numbers
/* import java.util.*;
public class Third {
   public static int Sum(int a, int b) {
       return a+b;
   }
   public static void main(String args[]) {
      int a = 3;
      int b = 2;
      int result = Sum(5,2);
      System.out.println(result);
   }
} */


//to check even/odd
/* import java.util.*;
public class Third {
   public static boolean isEven(int a) {
      if(a % 2 == 0) {
         return true;
      } else {
         return false;
      }
   }
   public static void main(String args[]) {
      //int a ;
      boolean result = isEven(88);
      System.out.println(result);
   }
} */



//code to return cube of a number
/* import java.util.*;
public class Third {
   public static int calcCube(int a) {
      return a*a*a;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int a = sc.nextInt();
      int result = calcCube(a);
      System.out.println("The cube of number is : " + result);
      sc.close();
   }
} */


//code to find greater of two numbers
/* import java.util.*;
public class Third {
   public static int greaterNumber(int a, int b) {
      if(a > b) {
         return a;
      } else {
         return b;
      }
   }
   public static void main(String args[]) {
      int a = 6;
      int b = 15;
      int result = greaterNumber(a, b);
      System.out.println("The greater number is : "+result);
   }
} */

//Write a function that prints numbers from 1 to n.
/* import java.util.*;
public class Third {
   public static void numbers(int n) {
      for(int i=1; i<=n; i++) {
         if(i % 2 == 0){
         System.out.print(i+" ");
   }
   }
   }
   public static void main(String args[]) {
      int n = 5;
      numbers(n);
   }
} */

//Write a function to check if a number is prime.
/* import java.util.*;
public class Third {
   public static boolean checkPrime(int n) {
      //corner cases
      //2 , 1,0
      if(n <= 1) {
         return false;
      }
      if(n == 2) {
         return true;
      }
      for(int i = 2; i<= Math.sqrt(n); i++) {
         if(n % i == 0) {
            return false;
         }
         }
         return true;
      }
   public static void main(String args[]) {
      System.out.println(checkPrime(5));
   }
} */

//Write a function to count digits in a number.
/* import java.util.*;
public class Third {
   public static void countNumber(int n) {
      if(n == 0) {
         System.out.println(1);
         return;
      }
      if(n < 0) {
         n = -n;
      }
      int count = 0;
      while(n > 0) {
         n = n/10;
         count++;
      }
      System.out.println(count);
   }
   public static void main(String args[]) {
      int n = 1234;
      countNumber(n);
   }
} */

//Write a function to reverse a number
/* import java.util.*;
public class Third {
   public static void reverseNumber(int n) {
      if(n == 0) {
         System.out.println(0);
         return;
      }
      int rev = 0;
      while(n > 0) {
      int lastDigit = n % 10;
      rev = rev*10+lastDigit;
      n = n / 10;
   }
   System.out.println("Reverse of number : " + rev);
}
   public static void main(String args[]) {
      int n = 1234;
      reverseNumber(n);
   }
} */

//Write a function to find sum of digits.
/* import java.util.*;
public class Third {
   public static void sumDigit(int n) {
      int sum = 0;
      while(n > 0) {
         int lastDigit = n % 10;
         sum += lastDigit;
         n = n/10; 
      }
      System.out.println("Sum of digits : "+sum);
   }
   public static void main(String args[]) {
      int n = 1234;
      sumDigit(n);
   }
} */

//Write a function to calculate factorial of a number.
/* import java.util.*;
public class Third {
public static void calcFactorial(int n) {
   //corner cases
   if(n == 0 || n == 1) {
      System.out.println(1);
      return;
   }
   if(n < 0) {
      System.out.println("Factorial not possible");
      return;
   }
   //main code to calc factorial
   int fact = 1;
   for(int i=1; i<=n; i++) {
      fact = fact*i;
   }
   System.out.println("The factorial of number : " + fact);
   }

public static void main(String args[]) {
   int n = 6;
   calcFactorial(n);
}
} */

// Write a function to check if a number is palindrome.
/* import java.util.*;
public class Third {
   public static void checkPalindrome(int n) {
      int rev = 0;
      int original = n;
      while(n > 0) {
         int lastDigit = n % 10;
         rev = rev*10 + lastDigit;
         n = n/10;
      }
      System.out.println(rev);
      if(rev == original) {
         System.out.println("number is palindrome");
      } else {
        System.out.println("not a palindrome");
      }
   }
   public static void main(String args[]) {
      int n = 12321;
      checkPalindrome(n);
   }
} */

// Write a function to swap two numbers using a function.
/* import java.util.*;
public class Third {
   public static void swap(int a,int b) {
      int temp = 0;
      temp = b;
      b = a;
      a = temp;
      System.out.println(a);
      System.out.println(b);
   }
   public static void main(String args[]) {
      int a = 3;
      int b = 4;
      swap(a, b);
   }
} */

// Write a function to check if a year is leap year.
/* import java.util.*;
public class Third {
   public static void checkLeapYear(int n) {
      if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
         System.out.println(n +" Is leap year");
      } else {
         System.out.println(n +" Is not a leap year");
      }
   }
   public static void main(String args[]) {
      checkLeapYear(1990);
   }
} */

//Write a function to calculate power (a^b)  using Math.pow()
/* import java.util.*;
public class Third {
   public static double calcPower(double a,double b) {
      return Math.pow(a,b);

   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter base number : ");
      double a = sc.nextDouble();
      System.out.print("Enter exponent(power) : ");
      double b = sc.nextDouble();
      double result = calcPower(a, b);
      System.out.print("The ans is : "+result);
      sc.close();
   }
} */

//Write a function to calculate power (a^b) without using Math.pow()
/* import java.util.*;
public class Third {
   public static void calcPower(int a,int b) {
      if(b == 0) {
         System.out.println(1);
         return;
      }
      int result = 1;
      for(int i=1; i<=b; i++) {
        result =  a*result;
      }
      System.out.print(result);
   }
   public static void main(String args[]) {
      int a = 5;
      int b = 2;
      calcPower(a, b);
   }
} */

//Write a function to check if a number is Armstrong.
/* import java.util.*;
public class Third {
   public static void ArmstrongNumbers(int n) {
      int original = n;
      int temp = n;
      int count = 0;

      while(temp > 0)  {
         temp = temp / 10;
         count++;
      }
      int temp2 = n;
      int sum = 0;
      while(temp2 > 0) {
         int digit = temp2 % 10;
         int power = 1;
         for(int i=1; i <= count; i++) {
            power = power*digit;
         }
         sum = sum + power;
         temp2 =  temp2 / 10;
      }
      if(sum == original) {
         System.out.println("number is armstrong");
      } else{
         System.out.println("number is not armstrong");
      }
     }

   public static void main(String args[]) {
      int n = 153;
      ArmstrongNumbers(n);
   }
} */

//Write a function to print Fibonacci series till n terms.
/* import java.util.*;
public class Third {
   public static void Fibonacci(int n) {
      if(n == 1) {
         System.out.println(0);
         return;
      }
      int first = 0;
      int second = 1;
      System.out.print(first + " " + second +" ");
      for(int i=3; i<=n; i++) {
         int f = first + second;
         System.out.print(f+" ");

         first = second;
         second = f;
      }
   }
   public static void main(String args[]) {
      Fibonacci(5);
   }
} */

//Write a function to find GCD of two numbers.
/* import java.util.*;
public class Third {
   public static int Gcd(int a,int b) {
     while(b != 0) {
      int rem = a % b;
      a = b;
      b = rem;
     }
     return a;
   }
   public static void main(String args[]) {
      int a = 18;
      int b = 12;
      System.out.println(Gcd(a, b));
   }
} */

// Write a function that takes a string and counts vowels.
/* import java.util.*;
public class Third {
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
      String s1 = "Andrew";
      countVowel(s1);
   }
} */

//Write a function to check if a string is palindrome.
/* import java.util.*;
public class Third { 
   public static void checkString(String s1) {
      String s2 = "";
      for(int i=s1.length()-1; i>=0; i--) {
         char ch = s1.charAt(i);
         s2 = s2+ch;
      }
       if(s2.equals(s1)) {
         System.out.println("String is palindrome");
      }
      else {
         System.out.println("String is not palindrome");
      }
   }
   public static void main(String args[]) {
      String s1 = "racecar";
      checkString(s1);
   }
} */

//Write a function to convert decimal to binary
/* import java.util.*;
public class Third {
   public static void DecTobin(int n) {
      int binary = 0;
      int pow = 0;
      while(n > 0 ) {
         int rem = n % 2;
         binary = binary+(rem*(int)Math.pow(10,pow));
         pow++;
         n = n/2;
      }
      System.out.println(binary);
   }
   public static void main(String args[]) {
      int n = 13;
      DecTobin(n);
   }
} */

//Write a function to convert binary to decimal
/* import java.util.*;
public class Third{
   public static void binTodec(int n) {
      int dec = 0;
      int pow = 0;
      while(n > 0) {
         int lastDigit = n % 10;
         dec = dec + (lastDigit*(int)Math.pow(2,pow));
         pow++;
         n = n / 10;
      }
      System.out.println(dec);
   }
   public static void main(String args[]) {
      binTodec(1101);
   }
} */