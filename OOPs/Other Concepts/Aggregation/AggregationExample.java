class Operation {  // Class for performing operations like square
    int square(int n) {
        return n * n;  // Returns the square of the number
    }
}

class Circle {  // Class for calculating circle's area
    Operation op;  // Aggregation: Circle has an instance of Operation class
    double pi = 3.14;

    // Method to calculate the area of the circle
    double area(int radius) {
        op = new Operation();  // Create an instance of Operation
        int rsquare = op.square(radius);  // Call square method of Operation
        return pi * rsquare;  // Calculate area: pi * radius^2
    }
}

public class AggregationExample {  // Main class with the name AggregationExample
    public static void main(String args[]) {  // Main method where execution starts
        Circle c = new Circle();  // Create an instance of Circle
        double result = c.area(5);  // Call the area method with radius 5
        System.out.println(result);  // Print the result
    }
}

// Output
// 78.5