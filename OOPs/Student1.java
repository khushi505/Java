class Student1 {
    // Defining fields
    int id;          // Field or instance variable
    String name;     // Field or instance variable

    // Main method inside the Student class
    public static void main(String[] args) {

        // Creating an object (instance) of the Student class
        Student1 s1 = new Student1();   // Object created using the 'new' keyword

        // Printing default values of the object fields
        System.out.println("Student ID: " + s1.id);     // Default value: 0
        System.out.println("Student Name: " + s1.name); // Default value: null
    }
}


// Output 
// Student ID: 0
// Student Name: null