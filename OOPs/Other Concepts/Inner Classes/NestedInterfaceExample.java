// Nested Interface Example
interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

public class TestNestedInterface1 implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new TestNestedInterface1();  // upcasting
        message.msg();  // Output: Hello nested interface
    }
}
