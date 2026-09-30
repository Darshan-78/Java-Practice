/* import java.util.*;
public class Fourth {
    public static void main(String args[]) {
        int marks[] = new int[100];
        System.out.println(marks.length);

        /* Scanner sc = new Scanner(System.in); // input in array
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();

         System.out.println("phy : " +marks[0]);
         System.out.println("chem : " +marks[1]);
         System.out.println("maths : " +marks[2]); */

         //updating array
         //marks[1] = marks[1] + 1;
         //System.out.println("chem : "+ marks[1]);

         // int percentage = (marks[0]+marks[1]+marks[2]) / 3;
         // System.out.println(percentage+"%");

        // marks[2] = 92;
        // System.out.println("maths : "+marks[2]);
   // }
// }


//Passing array in function
/* import java.util.*;
public class Fourth {
    public static void update(int marks[],int nonChangeable) {
        nonChangeable = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int nonChangeable = 5;
        int marks[] = {97,98,99};
        update(marks,nonChangeable);
        System.out.println(nonChangeable);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
} */

//linear search in arrays 
/* import java.util.*;
public class Fourth{
    public static int linearSearch(int numbers[],int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int ans = linearSearch(numbers, key);
        if(ans == -1) {
            System.out.println("Key not found");
        } 
        else {
            System.out.println("Key found at index : "+ans);
        }
    }
} */

//linear search on strings    
/* import java.util.*;
public class Fourth{
    public static int linearSearch(String menu[],String key) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        String menu[] = {"burger","dosa","sandwhich","patties","ice cream","samosa","cocacola","frooti"};
        String key = "samosa";
        int ans = linearSearch(menu, key);
        if(ans == -1) {
            System.out.println("Key not found");
        } 
        else {
            System.out.println("Key found at index : "+ans);
        }
    }
} */

// Find largest element in array
/* import java.util.*;
public class Fourth{
    public static int largest(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(numbers.length == 0) {
            return -1;
        }
        if(numbers.length == 1) {
            return numbers[0];
        }
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("smallest number in array is : "+min);
        return max;
    }
    public static void main(String args[]) {
        int numbers[] = {2,7,8,6,3,5};
        int ans = largest(numbers);
        System.out.println("largest number in array is : " +ans);
    }
} */

//Binary search in array
/* import java.util.*;
public class Fourth {
    public static int binarySearch(int numbers[],int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) { //right
                start = mid+1;
            }
            else { //right
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key is : "+binarySearch(numbers, key));
    }
} */

/* import java.util.*;
public class Fourth {
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length-1;
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);
        for(int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
    }
} */

//Move zeros at last in  array
/* import java.util.*;
public class Fourth {
    public static void moveZeros(int numbers[]) {
        int start = 0;
        for(int i=start; i<numbers.length;i++) {
            if(numbers[i] != 0) {
                numbers[start] = numbers[i];
                start++;
            }
        }
        for(int i=start; i<numbers.length; i++) {
            numbers[i] = 0;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {0,1,0,3,12};
        moveZeros(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
} */

//Pairs printing
 /*import java.util.*;
public class Fourth {
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
} */

//print Subarray
/* import java.util.*;
public class Fourth {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i=0; i < numbers.length; i++) {
            int sum = 0;
            for(int j = i; j < numbers.length; j++) {
                sum = numbers[j]+sum;
                ts++;
                System.out.println();
                System.out.println("Sum = " +sum);
            }
            System.out.println();
        }
        System.out.println("total subarrays = " +ts);
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
} */

//Kadanes algo max subarray
/* import java.util.*;
public class Fourth {
    public static void kadanesMs(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(currSum < 0) {
            currSum = 0;
            }
            else{
                currSum = currSum + numbers[i]; // currSum = Math.max(numbers[i], currSum + numbers[i]); ye bhi likh sakte he yaha isme if likhne ki jarurat nahi padegi
                }
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesMs(numbers);
    }
} */

//Prefix sum
/* import java.util.*;
public class Fourth {
    public static void PrefixSum(int numbers[]) {
     int ms = Integer.MIN_VALUE;
     int cs = 0;
     int prefix[] = new int[numbers.length];

     prefix[0] = numbers[0];

     for(int i=1; i<prefix.length;i++) {
        prefix[i] = numbers[i] + prefix[i-1]; 
     }
     for(int i=0; i<numbers.length; i++) {
        for(int j=i; j<numbers.length; j++) {
            if(i == 0) {
                cs = prefix[j];
            }
            else {
            cs = prefix[j] - prefix[i-1];
        }
        if(ms < cs) {
            ms = cs;
        }
     }
    }
     System.out.println(ms);
    }
    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        PrefixSum(numbers);
    }
}  */

//Trapping Rainwater problem  = it is also optimized  
/* import java.util.*;
public class Fourth {
    public static int trappingRainwater(int height[]) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        int maxLeft = 0;
        int maxRight = 0;

        for(int i=0; i<height.length; i++) {
            maxLeft = Math.max(maxLeft,height[i]);
            left[i] = maxLeft;
         }
         for(int j=height.length-1; j>=0; j--) {
            maxRight = Math.max(maxRight,height[j]);
            right[j] = maxRight;
         }
         int total = 0;
         for(int k=0; k<height.length;k++) {
            int water = Math.min(left[k],right[k]) - height[k];
            if(water > 0) {
                total = total + water;
            }
         }
         return total;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
       int ans =  trappingRainwater(height);
       System.out.println("Total water stored is = " + ans);
    }
} */

// more optimized trappingRainwater = here we use 2 pointers
/* import java.util.*;
public class Fourth {
    public static int trappingRainwater(int height[]) {
       int left = 0;
       int right = height.length-1;

       int maxLeft = 0;
       int maxRight = 0;
       int total = 0;

       while(left <= right) {
           maxLeft = Math.max(maxLeft,height[left]);
           maxRight = Math.max(maxRight,height[right]);

           int water = 0;

           if(maxLeft < maxRight) {
            water = maxLeft - height[left];
            left++;
           }
           else {
            water = maxRight - height[right];
            right--;
           }
           if(water > 0) {
            total = total+water;
           }
       }
       return total;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
       int ans =  trappingRainwater(height);
       System.out.println("Total water stored is = " + ans);
    }
} */

//best time to buy and sell stocks
/* import java.util.*;
public class Fourth {
    public static void Stocks(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(minPrice,prices[i]);

            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit);
    }
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        Stocks(prices);
    }
} */

//Remove duplicates from sorted array
import java.util.*;
public class Fourth {
    public static int removeDuplicate(int nums[]) {
        int k = 1;
        for(int i=1; i<=nums.length-1; i++) {
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]) {
        int nums[] = {1,1,2};
        int k = removeDuplicate(nums);
       System.out.println(k);

       for(int i=0; i < k; i++) {
        System.out.print(nums[i] +" ");
       }
    }
}