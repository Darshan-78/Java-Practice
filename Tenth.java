//Basic Array functions
/* import java.util.*;
public class Tenth {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max)  {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,5,7,9,4};
        int result = findMax(arr);
        System.out.println("Max value is : " +result);
    }
} */

/* import java.util.*;
public class Tenth {
    public static void main(String args[]) {
       int arr[] = {1,2,7,5,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String s = Arrays.toString(arr); // Print array as String.
        System.out.println(s.getClass()); // it need no arguments means nothing in bracket just call it ,it prints its type 
    }
} */

 /*import java.util.*;
 public class Tenth {
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4};
        int arr2[] = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
 }*/

/* import java.util.*;
public class Tenth {
    public static void main(String args[]) {
        int arr1[] = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        int arr2[] = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
} */

/* import java.util.*;
public class Tenth {
    public static void main(String args[]) {
        Integer arr1[] = {1,2,3,4};
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }
} */

/*import java.util.*;
public class Tenth {
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4};
       int arr2[] = {2,3,5,6};
        Arrays.fill(arr2,7);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}*/