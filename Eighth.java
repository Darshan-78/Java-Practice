/* import java.util.ArrayList; //implement stack using arrayList
public class Eighth {
   static class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }
    public void push(int data) {
        list.add(data);
    }
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }
   }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
} */

/* public class Eighth { //implement stack using Linked List
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
      public static Node head = null;

      public  boolean isEmpty() {
        return head == null;
      }

      public  void push(int data) {
         Node newNode = new Node(data);
        if(isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }
    public  int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public  int peek() {
         if(isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
} */

/* import java.util.*; implementing stack using java collection framework
public class Eighth {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    } 
} */


/* import java.util.*; // Valid parentheses
public class Eighth {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' ||  ch == '{') {
                s.push(ch);
            }
            else {
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek() == '(' && ch == ')')
                    || (s.peek() == '[' && ch == ']')
                    || (s.peek() == '{' && ch == '}')) {
                        s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "([]){}";
        System.out.println(isValid(str));
    }
} */

/* import java.util.*;
public class Eighth {
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
                if(s.isEmpty()) {
                    nxtGreater[i] = -1;
                }
                else {
                    nxtGreater[i] = arr[s.peek()];
                }
                s.push(i);
            }
            for(int i=0; i<nxtGreater.length; i++) {
                System.out.print(nxtGreater[i]+" ");
            }
            System.out.println();
        }
    }*/