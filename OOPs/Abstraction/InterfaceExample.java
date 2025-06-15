// Interface example demonstrating 100% abstraction
interface Drawable {
    void draw();  // implicitly public and abstract
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Drawable d = new Circle();  // Upcasting to interface
        d.draw();  // Output: Drawing circle...
    }
}
