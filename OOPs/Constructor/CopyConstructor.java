class CopyConstructor {
    int id;
    String name;

    // Constructor to initialize integer and string
    CopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor to initialize another object (Copy Constructor)
    CopyConstructor(CopyConstructor s) {
        id = s.id;
        name = s.name;
    }

    // Display method to print details
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating the first object
        CopyConstructor s1 = new CopyConstructor(111, "Karan");

        // Creating the second object by copying values from the first
        CopyConstructor s2 = new CopyConstructor(s1);

        // Displaying values of both objects
        s1.display();
        s2.display();
    }
}

// Output
// 111 Karan
// 111 Karan