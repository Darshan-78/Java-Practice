//most used hash set functions
/* import java.util.*;
public class Fifteenth {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3); // adds element in set
        set.add(4);
        System.out.println(set);
        System.out.println(set.remove(2)); // removes specific defined value in set . and return true if element present in set and removed successfully,otherwise returns false when it dosent find element which we want to remove
        System.out.println(set);
        System.out.println(set.contains(1)); // checks whether value exist in set or not and returns true,false on basis of it
    }
} */

//most used HashMap functions
/* import java.util.*;
public class Fifteenth {
    public static void main(String args[]) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"India");
        map.put(2,"China");
        map.put(3,"Usa"); //used to add key,value pair in map
        map.put(4,"Japan");
        map.put(5,"Australia");
        map.put(1,"Bharat"); // value gets overwriiten here so now it will becomes 1=Bharat
        System.out.println(map);
    }
} */

/* import java.util.*;
public class Fifteenth {
    public static void main(String args[]) {
        HashMap<Integer,Character> map = new HashMap<>();
        map.put(1,'A');
        map.put(2,'B');
        map.put(3,'C');
        map.put(4,'D');
        map.remove(2,'B'); // it is used to remove key,value pair from map ,if key and values match
        System.out.println(map);
        System.out.println(map.containsKey(2)); //it checks whether key is present in maps or not and returns true,false
        System.out.println(map.get(1)); // it returns value of defined key,returns null if key dosent exist
    }
} */

/* import java.util.*;
public class Fifteenth {
    public static void main(String args[]) {
        HashMap<Integer,Character> map = new HashMap<>();
        map.put(1,'A');
        map.put(2,'B');
        System.out.println(map.keySet()); //it returns keys only
        System.out.println(map.values()); //it returns values only
        System.out.println(map.getOrDefault(0,'z')); //if there is no key then it returns a default value ,as we have no 0 in map so it returns default value
    }
} */

/* import java.util.*;
public class Fifteenth {
    public static void main(String args[]) {
        int arr[] = {1,2,1,3,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1); // counts how many times each number occurs
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) { //gives collection of all key,value pairs
                System.out.println(e.getKey() + " -> " + e.getValue()); //e.getKey() it gives key of every pair and it e.getValue() gives value of every pair 
        }
    }
} */