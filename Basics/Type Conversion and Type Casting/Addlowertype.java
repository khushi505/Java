class Addlowertype {
    public static void main(String[] args) {
        byte a = 10;                      // Declaring a byte variable with value 10
        byte b = 10;                      // Declaring another byte variable with value 10

        // byte c = a + b;  // This line causes a compile-time error because `a + b` is promoted to int.
        
        byte c = (byte) (a + b);          // Explicitly casting the result to byte
        System.out.println("Result: " + c);  // Output: 20
    }
}


// Output
// Result: 20