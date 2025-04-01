class Employee  // Parent class
{
    float salary = 40000;   // Instance variable of Employee class
}

class Inheritance extends Employee  // Child class renamed to match the filename
{
    int bonus = 10000;   // Instance variable of Inheritance class

    public static void main(String args[])
    {
        Inheritance p = new Inheritance();    // Create an instance of the child class

        System.out.println("Programmer salary is:" + p.salary);  
        System.out.println("Bonus of Programmer is:" + p.bonus);  
    }
}

// Output
// Programmer salary is:40000.0
// Bonus of Programmer is:10000