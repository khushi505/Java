// Demonstrates upcasting: reference of superclass referring to subclass object

class A {
    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void show() {
        System.out.println("This is class B");
    }

    void display() {
        System.out.println("Exclusive method of class B");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        A obj = new B();  // Upcasting: parent reference to child object
        obj.show();       // Calls overridden method in class B

        // obj.display(); // ❌ Error: display() is not in class A
    }
}

// Output:
// This is class B
