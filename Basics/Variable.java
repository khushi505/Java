class Variable {
    int data = 50; // instance variable
    static int m = 100; // static variable

    void method() {
        int n = 90; // local variable
        System.out.println("Local variable: " + n);
        System.out.println("Instance variable: " + data);
        System.out.println("Static variable: " + m);
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.method();
    }
}
