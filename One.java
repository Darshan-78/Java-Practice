/* public class One {
  //code to check for leap year
    public static void main(String args[]) {
       int n = 2400;
       if((n%4==0 && n%100 != 0) || (n%400 == 0)) {
        System.out.println("leap year");
       } else {
        System.out.println("not a leap year");
       }
    }
} */

    /*import java.util.*;
    public class One {
      //code to check for vowel and consonant
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String s = "aeiouAEIOU";

        char a = s1.charAt(0);

        if(s.contains(String.valueOf(a))) {
          System.out.println("vowel");
        } else {
          System.out.println("consonant");
        }
      }
    } */

  public class One{
    int n = 4;
    public static void main(String args[]) {
      for(int i=4; i>=1; i--) {
        for(int j=1; j<=i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }