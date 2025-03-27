// Class representing a student with default constructor
class Student {
    int id;             // Student ID (default: 0)
    String name;         // Student name (default: null)

    // Method to display default values
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main class to demonstrate default constructor displaying default values
public class DefaultValues {
    public static void main(String[] args) {

        // Creating multiple objects of Student
        Student s1 = new Student();
        Student s2 = new Student();

        // Displaying default values of the objects
        s1.display();
        s2.display();
    }
}

// Output
// ID: 0, Name: null
// ID: 0, Name: null