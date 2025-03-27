class ConstructorOverloading {
    int id;
    String name;
    int age;

    // Constructor with two arguments
    ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor with three arguments
    ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Display method to print details
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        // Creating objects using different constructors
        ConstructorOverloading s1 = new ConstructorOverloading(111, "Karan");       // Two-arg constructor
        ConstructorOverloading s2 = new ConstructorOverloading(222, "Aryan", 25);   // Three-arg constructor

        // Displaying details
        s1.display();
        s2.display();
    }
}

// Output
// 111 Karan 0
// 222 Aryan 25