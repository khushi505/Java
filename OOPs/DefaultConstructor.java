// Class representing a Bike with a default constructor
class Bike {

    // Default constructor
    Bike() {
        System.out.println("Bike is created");
    }
}

// Main class to demonstrate default constructor
public class DefaultConstructor {
    public static void main(String[] args) {

        // ✅ Creating an object of Bike
        Bike b1 = new Bike();   // Calls the default constructor
    }
}

// Output
// Bike is created