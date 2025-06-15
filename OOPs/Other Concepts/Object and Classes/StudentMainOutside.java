// Defining the Student class with fields
class StudentMainOutside {
    int id;          // Instance variable to store student ID
    String name;     // Instance variable to store student name
}

// Creating another class containing the main method
class TestStudent1 {
    public static void main(String[] args) {
        // Creating an object (instance) of the Student class
        StudentMainOutside s1 = new StudentMainOutside();

        // Printing default values of the object fields
        System.out.println("Student ID: " + s1.id);     // Default value: 0
        System.out.println("Student Name: " + s1.name); // Default value: null
    }
}


// Output
// Student ID: 0
// Student Name: 
// RUN CODE USING - java TestStudent1