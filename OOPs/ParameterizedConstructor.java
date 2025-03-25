// Class representing a student with a parameterized constructor
class Student {
    int id;                // Student ID
    String name;            // Student name

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display the values
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main class to demonstrate parameterized constructor
public class ParameterizedConstructor {
    public static void main(String[] args) {

        // Creating objects with parameterized constructor
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        // Displaying the values of the objects
        s1.display();
        s2.display();
    }
}

// Output
// ID: 111, Name: Karan
// ID: 222, Name: Aryan