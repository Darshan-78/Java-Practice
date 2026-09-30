//basic queue functions
/* import java.util.*;
public class Fourteenth {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2); // adds element at end of queue if unable to add it throws exception
        q.add(3);
        q.offer(4); // it also adds element at end of queue if unable to add it returns false
        System.out.println(q); 
    }
} */

/* import java.util.*;
public class Fourteenth {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.poll(); // removes element from front of queue ,if queue is empty returns null
        q.remove(2); //removes defined element from queue
        q.remove(); // it too removes element from front of queue ,if queue is empty throws exception
        System.out.println(q);
    }
} */

/* import java.util.*;
public class Fourteenth {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.size()); // returns size of queue
        System.out.println(q.peek()); // returns front element of queue
        System.out.println(q.isEmpty()); // checks whether queue is empty or not
    }
} */

//Deque most used functions
/* import java.util.*;
public class Fourteenth {
    public static void main(String args[]) {
        Deque<Integer> q = new ArrayDeque<>();    
        q.add(1);
        q.add(2);
        q.add(3);
        q.addFirst(0); // adds element at front of deque
        q.addLast(4); // adds element at rear of deque
        System.out.println(q);
    }
} */

/*import java.util.*;
public class Fourteenth {
    public static void main(String args[]) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.pollFirst(); // removes element from front of deque , returns null if dq is empty
        q.pollLast(); // removes element from last of deque , returns null if dq is empty
        System.out.println(q);
    }
} */