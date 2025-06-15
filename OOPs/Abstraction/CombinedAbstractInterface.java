// Using both abstract class and interface
interface A {
    void a();  // abstract
    void b();
    void c();
    void d();
}

abstract class B implements A {
    public void a() {
        System.out.println("I am a");
    }

    public void c() {
        System.out.println("I am c");
    }
}

class M extends B {
    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }

    public static void main(String[] args) {
        A obj = new M();
        obj.a();  // I am a
        obj.b();  // I am b
        obj.c();  // I am c
        obj.d();  // I am d
    }
}
