/* public class sixth { // simple class and object creation
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.speed = 120;

        System.out.println(c1.brand);
        System.out.println(c1.speed);
    }
}

class Car {
    String brand;
    int speed;
} */

/*public class sixth {
    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.company = "Samsung";
        m1.price = 25000;

        m2.company = "Apple";
        m2.price = 40000;

        m1 = m2;
        m1.price = 100000;
        
        System.out.println(m1.company);
        System.out.println(m1.price);

        System.out.println(m2.company);
        System.out.println(m2.price);
    }
}

class Mobile {
    String company;
    int price;
} */

/* public class sixth { // use of function in class 
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Sam";
        s1.marks = 87;

        s2.name = "John";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int marks;

    void display(){
        System.out.println(name);
        System.out.println(marks);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Akash";
        e1.salary = 40000;

        e2.name = "Karan";
        e2.salary = 55000;

        //e1 = e2; // address stored in e2 gets copied to e1, so both references point to Karan object

        e1.showDetails(); // displays e1 object data
        e2.showDetails(); // displays e2 object data
    }
}

class Employee {
    String name;
    int salary;

    void showDetails() {
        System.out.println(name);
        System.out.println(salary);
    }
} */

/* public class sixth { //changing value of object using function
    public static void main(String args[]) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Wings of fire";
        b1.price = 250;

        b2.title = "Deep Work";
        b2.price = 300;
        System.out.println("before discount: ");

        b1.displayBook();
        b2.displayBook();

        b1.discount();
        b2.discount();

        System.out.println("After discount : ");
        b1.displayBook();
        b2.displayBook();
    }
}

class Book {
    String title;
    int price;

    void displayBook() {
        System.out.println(title);
        System.out.println(price);
    }
    void discount() {
        price = price - 50;
    }
}  */

/* public class sixth { // creating constructor
    public static void main(String args[]) {
        Student s1 = new Student("Ajay",120);
        s1.display();
    }
}

class Student {
    String name;
    int marks;

    Student(String n, int m){
        name = n;
        marks = m;
    }
    void display() {
        System.out.println(name);
        System.out.println(marks);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Car c1 = new Car("Audi",200);
        Car c2 = new Car("BMW",180);

        c1.show();
        c2.show();

    }
}

class Car {
    String brand;
    int speed;

    Car(String b, int s) {
        brand = b;
        speed = s;
    }
    void show() {
        System.out.println(brand);
        System.out.println(speed);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Employee e1 = new Employee("Max",30000);
        Employee e2 = new Employee("Dom",84000);
        e1.showDetails();
        e2.showDetails();
    }
}

class Employee {
    String name;
    int salary;


Employee(String n, int s) {
    name = n;
    salary = s;
}
    void showDetails(){
        System.out.println(name);
        System.out.println(salary);
    }
} */

/* public class sixth { // using this keyword in constructor
    public static void main(String args[]) {
        Student s1 = new Student("Axel",90);
        Student s2 = new Student("Miguel",92);

        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println(name);
        System.out.println(marks);
    }
 } */

/* public class sixth { //constructor overloading
public static void main(String args[]) {
Book b1 = new Book();
Book b2 = new Book("Maths");
Book b3  = new Book("Maths",200);

b1.display();
b2.display();
b3.display();
}
}

class Book {
    String title;
    int price;

    Book() {
        System.out.println("Default constructor is called");
    }

    Book(String title) {
        this.title = title;
    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
     void display() {
        System.out.println(title);
        System.out.println(price);
     }
} */

//Encapsulation

/* public class sixth {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Ayush");
        s1.setMarks(87);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}

class Student {
    private String name;
    private int marks;

    void setName(String name) {
    this.name = name;
}

String getName() {
    return name;
}

void setMarks(int marks) {
    if(marks >= 0 && marks <= 100) {
        this.marks = marks;
    }
    else {
        System.out.println("Invalid Marks");
    }
}
int getMarks() {
    return marks;
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setName("Arjun");
        e1.setSalary(15000);

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}

class Employee {
    private String name;
    private int salary;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    void setSalary(int salary) {
        if(salary >= 0) {
        this.salary = salary;
    }
    else {
        System.out.println("Invalid salary");
    }
}
    int getSalary() {
        return salary; 
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Student s1 = new Student("Karn",150);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}

class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    String getName() {
        return name;
    }

    void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            System.out.println("Invalid marks");
        }
    }
    int getMarks() {
      return marks;
    }
} */

/*public class sixth { //static keyword
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.showCount();
    }
}

class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    static void showCount() {
        System.out.println(count);
}
} */

/* public class sixth {
    public static void main(String args[]) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Aman");
        Employee.showTotalEmployees();
    }
}

class Employee {
    String name;
    static int totalEmployees = 0;

    Employee(String name) {
        this.name = name;
        totalEmployees++;
    }
    static void showTotalEmployees() {
        System.out.println(totalEmployees);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Car c = new Car();
        c.company = "Tata";
        c.model = "Nexon";
        c.start();
        c.display();
    }
}

class Vehicle {
 String company;
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    String model;
    void display() {
        System.out.println(company);
        System.out.println(model);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Student s = new Student("Andrew", 90);
        s.display();
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    int marks;

    Student(String name, int marks) {
        super(name);
        this.marks = marks;
        System.out.println("Student constructor");
    }
    void display() {
        System.out.println(name);
        System.out.println(marks);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Manager m = new Manager("Rohan",50000.0,"IT");
        m.showEmployee();
        m.showManager();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee constructor");
    }
    void showEmployee() {
        System.out.println(name);
        System.out.println(salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
        System.out.println("Manager constructor");
    }
    void showManager() {
        System.out.println(department);
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Developer d = new Developer();
        d.work();
    }
}

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        super.work();
        System.out.println("Developer is writing code");
    }
} */

//Polymorphism 
/* public class sixth {
    public static void main(String args[]) { //Reference type decides what methods are accessible. //Object type decides which overridden version runs.
        //Storing a child object inside a parent reference is called upcasting.
        Vehicle v = new Car();
        v.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting");
    }
} */


/* public class sixth { //Downcasting converts a parent reference back to a child reference to access child-specific methods.
    public static void main(String args[]) {
        Animal a = new Dog();
        a.eat();
        Dog d = (Dog) a;
        d.run();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog running");
    }
} */

/* public class sixth { // instanceof checks whether an object belongs to a particular class before downcasting.
//Prevent ClassCastException during downcasting.
    public static void main(String args[]) {
        Animal a = new Dog();

        if(a instanceof Dog) {
            Dog d = (Dog)a;
            d.run();
        } else {
            System.out.println("Not a dog");
        }
    }
}

class Animal {
   
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog running");
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.add();
        c.add(10,20,30);
        c.add(10,20);
        c.add(10.5,15.5);
    }
}

class Calculator {
    void add() {
        System.out.println("No number provided");
    }

    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(double a, double b) {
        System.out.println(a+b);
    }
} */

//Abstraction
/* public class sixth {
    public static void main(String args[]) {
        //Shape s = new Circle();
        //s.draw();
        //s.message();

        Circle c = new Circle();
        c.draw();
        c.message();
    }
}

abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
} */

//Interface
/* public class sixth {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.sound();
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog bark");
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        //Smartphone s = new Smartphone();
        //s.clickPhoto();
        //s.playMusic();

        Camera c = new Smartphone();
        c.clickPhoto();

        MusicPlayer m = new Smartphone();
        m.playMusic();
    }
}

interface Camera {
    void clickPhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements MusicPlayer,Camera {
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
} */


/* public class sixth {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.sleep();
        d.bark();
    }
}

class Animal {
    final void sleep() {
        System.out.println("Animal sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking");
    }
} */

/* public class sixth {
    public static void main(String args[]) {
        Student s1 = new Student("Alex");
        System.out.println(s1.getClass());
        System.out.println(s1.toString());
        System.out.println(s1.equals(s1));
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
} */