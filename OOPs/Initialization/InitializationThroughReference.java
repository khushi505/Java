// Class representing a student
class Program3 {
    int id;           // Student ID
    String name;      // Student name
}

// Main class demonstrating initialization through reference
class InitializationThroughReference{
    public static void main(String[] args) {

        // Creating an object of Student class
       Program3 s1 = new Program3();

        // Initializing fields through reference variable
        s1.id = 101;
        s1.name = "Sonoo";

        // Printing initialized values
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
    }
}


// Output 
// Student ID: 101
// Student Name: Sonoo