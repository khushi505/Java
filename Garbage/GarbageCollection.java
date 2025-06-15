// Demonstrating the use of System.gc() to suggest garbage collection
public class GarbageCollection {
    // Overriding the finalize method to observe garbage collection
    @Override
    protected void finalize() {
        System.out.println("Garbage collection performed on object: " + this);
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();

        // Nullifying references to make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggesting garbage collection
        System.gc();

        // Adding a delay to allow garbage collection to occur
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
