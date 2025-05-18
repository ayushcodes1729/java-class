- How to take user Input in java

- Import Scanner class

- - nextInt()

* Comments
- // This is a comment
-Ignored by compiler
- Multiple line: /* statement 1
Statement 2
*/

- We can use HTML Tags
- We can use heading name
- We can use author name
- We can use various tags to store parameters

Documentation comments:

/**
 * This class represents a simple object with a name.
 *
 * @author John Doe
 * @since 1.0
 */
public class Person {
    private String name;

    /**
     * Constructor for the Person class.
     *
     * @param name The name of the person.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }
}


Java provides three types of control flow statements.

Decision Making statements
- if statements
- switch statement
- Loop statements
- do while loop
- while loop
- for loop
- for-each loop
- Jump statements
- break statement
- continue statement

* Arrays(data structure):
- These are objects
- Non-primitive datatypes
- Collection of elements with similar datatypes
For Single Dimensional Arrays
- 3 ways to declare an array:
- - datatype[] arrayname;
- - datatype []arrayname;
- - datatype arrayname[];
- eg. int arr[];
- Initializing an array:
- - int[] arr = new int[10]
- Assign values to an array:
- - int[] arr = {2,,3,5,31,21}
- - String[] s = new String[5];  s[0] = "Ram";

- Multi-Dimensional array
- - int [][] arrayName = new int[size][size]
- - int [][] arrayName = {{2,3,4},{5,6}}

- Strings
- - It is a seq. of characters enclosed in ""
- - String is an object in java and non-primitive data type in java
- - String objects are immutable
- - Two ways to declare a Strings in java
1. Creating literals: String stringName = "CSIT"
2. By creating object: eg. String s = new String("CSIT");
- NOTE: When we use new keyword to declare or create object, the memory is allocated in the heap area.
- - substring(int startIndex, int endIndex);
- - compareTo - Returns 0 if the string is equal to the other string
- - If the string is less than the other string (lexicographically) -ve result 
- - If the string is greater than the other string (lexicographically) +ve result 

- OOPs Concepts
1. Class
2. Object- Instance of a classs
- - Objects have a state(fields & variables) and behavior(methods)
- - Methods operates on states
- - Object's states and behaviour define 1:1 communication between objects
3. Inheritance - It is a mechanism that allows a class to inherit features(variables and methods) of another class
- - The class that is being inherited is called as parent/super/base class
- - The class that inherits is called as child/sub/derived classs
- - How do we inherita a class ?
- - We use extends keyword to inherit
- - What can you do in subclass ?
- - The inherited field can be used directly
- - We can declare a field in the sub-class as super class
- - You can declare any new field in the sub-class that are not declared in the super-class
- - We can overwrite methods or can be used directly
- - You can declare the objects of superclass in a subclass but not vice-versa
- - Constructor: We can write subclass constructor that invokes the constructor of super class with super keyword
- - Types of Inheritance: 
- - 1. Single level Inheritance
- - 2. Multi level Inheritance
- - 3. Hierarchial level Inheritance
- - 4. Multiple Inheritance: When 2 or more class are being inherited by 1 class, this inheritance is known as multiple inheritance. But java doesn't supports multiple inheritance using classes. So we require interface to execute multiple inheritance in java.
- - Syntax: class C extends A,B{

}
- - 5. Hybrid Inheritance: When we combine 2 or more types of inheritance
- - Final keyword: It is a non access modifier
- - final variables, final methods, final classes
- - It restricts the modification or overriding of classes methods or variables
- NOTE: 
- - Object is always created in the main method
- - A class can be public in which inheritance is done.

4. Abstraction: It is a mechanism of OOPs concept that allows to hide complex implementation details and exposes necessary information to the user.
- In java abstraction can be achieved in 2 ways:
- - 1. By using abstract class: Abstract keyword is a non-access specifier
- - Abstract class can have both abstract and non-abstract methods
- - We can not create an object of an abstract class directly in the same class
- - Abstract methods declared in an abstrat class are need to be overriden in the other class for implementation
- - Abstract class: 
- - If a method is declared with the abstract keyword then the class in which it is must also be abstract
- - All the fields in the abstract class can be declared static, non-static, final, non-final, public, private, or protected
- - Abstract classes can have constructors
- - 2. By Interfaces: Interface is a blueprint like a class
- - # Methods declared in an interface are abstract by default
- - We can also declare non-abstract method using default keyword
- - All fields are automatically public, static, and final
- - We use implemnts keyword to implement interface in a class
- - When a class implements interface all the methods declared in the interface must be overriden by the class
5. Polymorphism:A concept in OOPs that allows objects to behave differently on their specific types
- 1. Method Overloading
- 2. Method Overrriding
- 3. Multiple Behaviours
- 4. Runtime Decisions
- - It can be of 2 types
- 1. Compile-time Polymorphism(Static): Method Overloading
- - It allows to define multiple methods with the same name but different parameters with in a class
- - Overloading doesn't depends on the return type of the method.
- - class A {
    void mat(int x){}
    void mat(int x, string S, int z){}
    void mat(){}
}
- - We can overload a method by changing the number of parameters 
- - by changing the data type of the arguments
- - By changing the order of the parameters 
- 2. Run-time Polymorphism(Dynamic)

- # Overriding occurs when a class implements a method that is already written in another class with the same name and parameters
- - Child class implements the method of the parent class
- - They must have same return types and same data types for parameters
6. Incapsulation
7. Modularity

# Packages
- Packages are directories same as folders in the system hat contain classes, interfaces & sub packages
- Builtiin packages: These are pre-defined packages consists oflarge no. of classes and interfaces which are part of java sdk
- There are no. of packages:
- 1. java.lang: It is a default package that is automatically imported, it contains classes which define primitive data types and maths operations
- 2. java.util: It contains utility classes which implement data structures and support date and time operations
- 3. java.io: It supports I/O operations
- 4. java.net: It supports networking operations
- 5. java.awt: It implements

# How to import pakages and access classes inside package?
- We use import keyword 
- We use directory

# How to create user defined packages
- We use package keyword to create user-defined package
- Syntax: package packageName //on the top of the src code

# Static import in java
- It is a feature that allows members(variables and methods) defined as public static to be used in java code without specifying the class in which it is defined