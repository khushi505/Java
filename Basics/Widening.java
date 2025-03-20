class Widening {
    public static void main(String[] args) {
        int a = 10;           // Integer variable
        float f = a;           // Widening: int → float
        double d = f;          // Widening: float → double
        long l = a;            // Widening: int → long

        System.out.println("Integer value (int): " + a);
        System.out.println("Widened value to float: " + f);
        System.out.println("Widened value to double: " + d);
        System.out.println("Widened value to long: " + l);
    }
}

// Output - 
// Integer value (int): 10
// Widened value to float: 10.0
// Widened value to double: 10.0
// Widened value to long: 10