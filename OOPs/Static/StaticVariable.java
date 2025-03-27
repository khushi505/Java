class Student {
    int rollno;             // Instance variable
    String name;            // Instance variable
    static String college;  // Static variable

    // Constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticVariable {
    public static void main(String args[]) {
        Student.college = "ITS";  // Initialize static variable

        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        s1.display();
        s2.display();
    }
}

// Output
// 111 Karan ITS
// 222 Aryan ITS
