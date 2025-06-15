// Demonstrating the use of 'this' to invoke the current class method
class ThisInvokeMethod {
    void displayMessage() {
        System.out.println("Hello from displayMessage method");
    }

    void invokeDisplay() {
        System.out.println("Invoking displayMessage method");
        this.displayMessage(); // Explicitly invoking displayMessage() using 'this'
        // displayMessage();   // Implicitly invoking displayMessage() without using 'this'
    }

    public static void main(String[] args) {
        ThisInvokeMethod obj = new ThisInvokeMethod();
        obj.invokeDisplay();
    }
}

// Output
// Invoking displayMessage method
// Hello from displayMessage method