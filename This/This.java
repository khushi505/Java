// Class representing a student
class Student {
    int rollno;     // Instance variable for roll number
    String name;    // Instance variable for name
    float fee;      // Instance variable for fee

    // Constructor to initialize the variables
    Student(int rollno, String name, float fee) {
        this.rollno = rollno;  // Assigning constructor parameter to instance variable
        this.name = name;      // Assigning constructor parameter to instance variable
        this.fee = fee;        // Assigning constructor parameter to instance variable
    }

    // Method to display student details
    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

// Test class to create and display the values of Student objects
public class This {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan", 5000f);
        Student s2 = new Student(112, "Aryan", 6000f);
        s1.display();
        s2.display();
    }
}

// Output
// 111 Karan 5000.0
// 112 Aryan 6000.0