class A  
{
    void msg()  
    {  
        System.out.println("Hello");  
    }  
}  

class B  
{
    void msg()  
    {  
        System.out.println("Welcome");  
    }  
}

// This will cause a compile-time error
class C extends A, B  
// Java doesn't support multiple inheritance with classes
{
    public static void main(String args[])  
    {  
        C obj = new C();  
        obj.msg();    // Ambiguity: Should it call A's or B's msg()?
    }  
}

// Output
// MultipleInheritanceError.java:18: error: '{' expected
// class C extends A, B  
//                  ^
// 1 error
