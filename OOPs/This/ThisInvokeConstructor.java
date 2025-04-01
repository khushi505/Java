// Demonstrating the use of 'this()' to invoke the current class constructor
class ThisInvokeConstructor {
    // Default constructor
    ThisInvokeConstructor() {
        System.out.println("Default constructor invoked");
    }

    // Parameterized constructor
    ThisInvokeConstructor(int x) {
        this(); // Invoking the default constructor
        System.out.println("Parameterized constructor invoked with value: " + x);
    }

    public static void main(String[] args) {
        ThisInvokeConstructor obj = new ThisInvokeConstructor(10);
    }
}

// Output
// Default constructor invoked
// Parameterized constructor invoked with value: 10