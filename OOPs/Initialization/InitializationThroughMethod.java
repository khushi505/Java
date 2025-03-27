// Class representing a student
class Program4 {
    int rollno;            // Student roll number
    String name;           // Student name

    // Method to initialize fields
    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method to display student information
    void displayInformation() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
    }
}

// Main class demonstrating initialization through method
public class InitializationThroughMethod {
    public static void main(String[] args) {
        // Creating two objects of the Student class
        Program4 s1 = new Program4();
        Program4 s2 = new Program4();

        // Initializing the objects using the insertRecord method
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");

        // Displaying information of both objects
        s1.displayInformation();
        s2.displayInformation();
    }
}


// Output 
// Roll No: 111, Name: Karan
// Roll No: 222, Name: Aryan