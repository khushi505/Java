// Demonstrating how objects can become unreferenced in Java
class UnreferencedObject {
    int id;
    String name;

    // Constructor to initialize the object
    UnreferencedObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // By nulling the reference
        UnreferencedObject obj1 = new UnreferencedObject(1, "Object One");
        obj1.display();
        obj1 = null; // obj1 is now unreferenced

        // By assigning a reference to another
        UnreferencedObject obj2 = new UnreferencedObject(2, "Object Two");
        UnreferencedObject obj3 = new UnreferencedObject(3, "Object Three");
        obj2.display();
        obj3.display();
        obj2 = obj3; // The original object referenced by obj2 is now unreferenced

        // By creating an anonymous object
        new UnreferencedObject(4, "Anonymous Object").display();
        // The object created above is unreferenced after this line
    }
}

// Output 
// ID: 1, Name: Object One
// ID: 2, Name: Object Two
// ID: 3, Name: Object Three
// ID: 4, Name: Anonymous Object