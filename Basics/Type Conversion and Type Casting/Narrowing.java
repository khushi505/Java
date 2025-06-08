class Narrowing {
    public static void main(String[] args) {
        float f = 10.5f;        // Floating-point variable

        // int a = f;           // ❌ Compile-time error: cannot implicitly convert float to int
        int a = (int) f;        // ✅ Explicit narrowing conversion: float → int

        System.out.println("Float value: " + f);
        System.out.println("Narrowed int value: " + a);
    }
}


// Output 
// Float value: 10.5
// Narrowed int value: 10