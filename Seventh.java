/*public class Seventh {  //LL creation
   public static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
   }
   public static Node head;

    public static void main(String args[]) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        head = n1;

        Node temp = head;

        while(temp != null) { // LL traversal
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* public class Seventh { // Search in LL
    public static class Node {
        int data;
        Node next;

        Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public static Node head;

public static boolean search(int key) {
   Node temp = head;
   while(temp != null) {
    if(temp.data == key) {
        return true;
    }
    temp = temp.next;
    }
return false;
}
public static void main(String args[]) {
    head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    System.out.println(search(20));
    }
} */

/*public class Seventh { //insert at the beginning
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node Newhead = new Node(5); 
        Newhead.next = head;
        head = Newhead;

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* public class Seventh { // insert in beginning
    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void main(String args[]) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);

        Node m1 = new Node(1);
        m1.next = head;
        head = m1;

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* public class Seventh { // insert at the end
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        head = new Node(12);
        head.next = new Node(13);
        head.next.next = new Node(14);

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
            Node newTail = new Node(15);
            temp.next = newTail;

            temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    } */

/* public class Seventh { //Delete beginning node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = head.next;
        System.out.println(head.data);

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* public class Seventh { Reverse a LL
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

         Node curr = head;
         Node prev = null;
         Node next;

         while(curr != null) {
         next = curr.next;
         curr.next = prev;
         prev = curr;  
         curr = next;
         }
         head = prev;
         
         Node temp = head;

         while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }
    }
} */

/* public class Seventh {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        head = prev;

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* curr → current node being processed.
prev → starting node of the already reversed part.
next → saves the remaining list before links are reversed. */

/* public class Seventh { //find middle of ll using fast and slow approach
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
} */

/* public class Seventh { //Cycle detection
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                System.out.println("Cycle exist");
                return;
            } 
        }
        System.out.println("No Cycle");
    }
} */

//Insert at any position    
/* public class Seventh {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        Node temp = head;
        Node curr;

       while(temp.data != 4) {
        temp = temp.next;
       }
       Node newNode = new Node(6);
       curr = temp.next;
       temp.next = newNode;
       newNode.next = curr;

       temp = head;
       while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
       }
    }
} */


/*import java.util.*;
public class Seventh { // bonus distribution
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int i=0; i<n; i++) {
        if(max < arr[i]) {
            max = arr[i];
        }
        sum += arr[i];
    }
    int avg = sum/n;

    int bonus = 0;
    int total = 0;
    for(int i=0; i<n; i++) {
        if(arr[i] > avg) {
            bonus = arr[i]-avg;
            total += bonus;
    }
}
 System.out.print(total);
}
} */

/* import java.util.*;
public class Seventh { // Doubly linkedList creation    
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        Node a = new Node(15);
        head.next.next.prev = a;
        a.prev = head.next;
        a.next = head.next.next;
        head.next.next = a;

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */


/* public class Seventh { // delete end in singly ll
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        if(head == null) {
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

//Delete node from beginning of ll in a doubly ll
/* public class Seventh {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        if(head == null) {
            return;
        }
        if(head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

//Delete node from end of ll in doubly ll
/* public class Seventh {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        tail = head.next.next;

        if(head == null) {
            return;
        }
        if(head.next == null) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

//Delete node from end of ll in doubly ll
/* public class Seventh {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        if(head == null) {
            return;
        }
        if(head.next == null) {
            head = tail = null;
            return;
        }

        tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }

        tail.prev.next = null;
        tail = tail.prev;

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

/* public class Seventh { // Delete position in Singly Linked list 
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = head;
        while(temp.next.data != 4) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} */

 /* public class Seventh { // delete node from position in doubly ll
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        Node temp = head;
        while(temp.next.data != 3) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next != null) {
        temp.next.prev = temp;
        }
        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
 } */