// Class representing a student with constructor overloading
class Student {
    int id;                 // Student ID
    String name;             // Student name
    int age;                 // Student age

    // Constructor with two arguments
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor with three arguments (overloaded)
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display the values
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

// Main class to demonstrate constructor overloading
public class ConstructorOverloading {
    public static void main(String[] args) {

        // Using two-argument constructor
        Student s1 = new Student(111, "Karan");

        // Using three-argument constructor
        Student s2 = new Student(222, "Aryan", 20);

        // Displaying the values of the objects
        s1.display();
        s2.display();
    }
}

// Output
// ID: 111, Name: Karan, Age: 0
// ID: 222, Name: Aryan, Age: 20