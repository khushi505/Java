class Overflow {
    public static void main(String[] args) {
        // Overflow example
        int a = 130;         // Integer value
        byte b = (byte) a;    // Casting int to byte, causing overflow

        System.out.println("Original int value: " + a);    // Prints 130
        System.out.println("After casting to byte: " + b); // Prints -126 due to overflow
    }
}

// Output
// Original int value: 130
// After casting to byte: -126