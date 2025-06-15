package mypack;

import pack.A; // Importing specific class

public class B_ImportClass {
    public static void main(String args[]) {
        A obj = new A(); // Direct usage
        obj.msg();
    }
}

/*
Output:
Hello from class A in package 'pack'
*/