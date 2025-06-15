// Abstract class example demonstrating 0 to 100% abstraction
abstract class Shape {
    abstract void draw();  // abstract method

    void info() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class AbstractClassExample {
    public static void main(String[] args) {
        Shape s = new Rectangle();  // Upcasting
        s.draw();  // Output: Drawing rectangle...
        s.info();  // Output: This is a shape.
    }
}
