// Class demonstrating factorial calculation
class Calculation {
    
    // Method to calculate factorial
    void fact(int n) {
        int fact = 1;  // Initialize factorial variable
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

// Main class demonstrating method calls through reference and anonymous object
public class MethodCallDemo {
    public static void main(String[] args) {

        // Calling method through a reference
        Calculation c = new Calculation();   // Creating object with reference variable
        c.fact(5);                            // Calling the fact() method with reference

        // Calling method through an anonymous object
        new Calculation().fact(5);            // Calling the fact() method with anonymous object
    }
}


// Output 
// Factorial of 5 is: 120
// Factorial of 5 is: 120
