/* import java.util.*;
public class Ninth {
    public static void main(String args[]) {
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("USA",12); // put - it helps in value insertion in map
        map.put("India",14);
        map.put("Mexico",18);

        System.out.println(map);

        //Get - it directly gives value of key
        int population = map.get("India");
        System.out.println(population);
        System.out.println(map.get("Indonesia"));

        //Contains key - check whether value exist or not and give true,false as per it
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Spain"));

        //Remove - to remove any value from data
        System.out.println(map.remove("Mexico"));
        System.out.println(map);
    }
} */

/* import java.util.*;
public class Ninth {
    public static void main(String args[]) {
        HashMap<String,Integer>map = new HashMap<>();

        map.put("India",100);
        map.put("Usa", 101);
        map.put("Uk",103);
        map.put("Japan",104);
        map.put("Korea",105);

        // loop/iteration on HashMap
       Set<String>keys = map.keySet();
       System.out.println(keys);

       for (String k : keys) {
        System.out.println("key="+k+ ",value="+map.get(k));
       }
    }
} */