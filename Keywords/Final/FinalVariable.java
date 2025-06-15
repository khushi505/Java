class Bike9 {
    final int speedlimit = 90; // Final variable

    void run() {
        // speedlimit = 400; // Uncommenting this will cause compile-time error
        System.out.println("Speed limit is: " + speedlimit);
    }

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}

/* Output:
Speed limit is: 90
*/
