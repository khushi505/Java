// Class representing a student
class Student {
    int rollno;               // Instance variable for roll number
    String name;              // Instance variable for name
    static String college = "ITS";  // Static variable for college name

    // Static method to change the value of the static variable
    static void changeCollege() {
        college = "BBDIT";
    }

    // Constructor to initialize the instance variables
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method to display student details
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to create and display the values of Student objects
public class StaticMethod {
    public static void main(String args[]) {
        Student.changeCollege();  // Calling the static method to change college name

        // Creating Student objects
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");

        // Displaying the details of each student
        s1.display();
        s2.display();
        s3.display();
    }
}

// Output 
// 111 Karan BBDIT
// 222 Aryan BBDIT
// 333 Sonoo BBDIT