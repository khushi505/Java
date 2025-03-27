// Class representing a rectangle with fields
class Rectangle {
    int length;         // Length of the rectangle
    int breadth;        // Breadth of the rectangle

    // Method to initialize rectangle dimensions
    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and display the area of the rectangle
    void displayArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

// Main class demonstrating multiple objects by one type
public class MultipleObjectsDemo {
    public static void main(String[] args) {

        // Creating multiple objects using one type (Rectangle)
        Rectangle r1 = new Rectangle(), r2 = new Rectangle();

        // Initializing objects with dimensions
        r1.setDimensions(10, 5);
        r2.setDimensions(7, 3);

        // Displaying areas of both rectangles
        r1.displayArea();
        r2.displayArea();
    }
}


// Ouput 
// Rectangle Area: 50
// Rectangle Area: 21