package mypack;

import pack.*; // Importing all classes from pack

public class B_ImportWildcard {
    public static void main(String args[]) {
        A obj = new A(); // Direct use after import
        obj.msg();
    }
}

/*
Output:
Hello from class A in package 'pack'
*/