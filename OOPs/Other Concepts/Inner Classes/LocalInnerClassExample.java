// Local Inner Class Example
public class LocalInnerClassExample {
    private int data = 30;  // instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();  // Output: 30
    }

    public static void main(String args[]) {
        LocalInnerClassExample obj = new LocalInnerClassExample();
        obj.display();
    }
}
