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

class Cat extends Animal  // Another child class inheriting from Animal  
{  
    void meow()  
    {  
        System.out.println("Cat is meowing...");  
    }  
}  

class HierarchicalInheritance  // Main class matching the filename
{  
    public static void main(String args[])  
    {  
        Cat cat = new Cat();      // Create an object of Cat  
        cat.meow();                // Call Cat's method  
        cat.eat();                 // Call inherited method from Animal  
        
        // The following line is commented out as Cat cannot access Dog's method
        // cat.bark();  
    }  
}  


// Output
// Cat is meowing...
// Animal is eating...