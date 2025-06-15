package mypack;

// No import used

public class B_FullyQualified {
    public static void main(String args[]) {
        pack.A obj = new pack.A(); // Fully qualified usage
        obj.msg();
    }
}

/*
Output:
Hello from class A in package 'pack'
*/