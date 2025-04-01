class Animal  // Parent class
{
    void eat()  
    {  
        System.out.println("Animal is eating...");  
    }  
}  

class Dog extends Animal  // Child class inheriting from Animal  
{  
    void bark()  
    {  
        System.out.println("Dog is barking...");  
    }  
}  

class SingleInheritance  // Main class matching the filename
{  
    public static void main(String args[])  
    {  
        Dog dog = new Dog();        // Create an object of Dog class  
        dog.bark();                  // Call Dog's method  
        dog.eat();                   // Call inherited method from Animal  
    }  
}  


// Output 
// Dog is barking...
// Animal is eating...
