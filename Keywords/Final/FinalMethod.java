class Bike {
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    // void run() { System.out.println("running safely with 100kmph"); } // Compile-time error

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run(); // Calls final method from parent
    }
}

/* Output:
running
*/
