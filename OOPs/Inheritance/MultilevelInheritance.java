class Animal  // Parent class
{
    void eat()  
    {  
        System.out.println("Animal is eating...");  
    }  
}  

class Dog extends Animal  // Intermediate child class inheriting from Animal  
{  
    void bark()  
    {  
        System.out.println("Dog is barking...");  
    }  
}  

class BabyDog extends Dog  // Child class inheriting from Dog  
{  
    void weep()  
    {  
        System.out.println("BabyDog is weeping...");  
    }  
}  

class MultilevelInheritance  // Main class matching the filename
{  
    public static void main(String args[])  
    {  
        BabyDog babyDog = new BabyDog();    // Create an object of BabyDog  
        babyDog.weep();                     // Call BabyDog's method  
        babyDog.bark();                     // Call inherited method from Dog  
        babyDog.eat();                      // Call inherited method from Animal  
    }  
}  

// Output
// BabyDog is weeping...
// Dog is barking...
// Animal is eating...