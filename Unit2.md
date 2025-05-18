# Exceptional Handling

## Exceptions
- - Exceptions are unwanted events that occurs during the excecution of the program (runtime), they disrupt the normal flow of the program's instruction
- - Exceptions are runtime errors.

## Exception Handling
- - It is a mechanism that allows programmersto manage runtime errors

## Types of Exceptions
1. User define
2. Built-in 
        |
    ____|____
    |       |
    |       |
Checked    Unchecked
- Checked: These exceptions are checked at the compile time by the compiler.
- 1. IOExceptions: Occurs when input output fails
- 2. classNotFoundException:
- 3. SQLException: When their is an error with DB.
- 4. FileNotFoundException:
- 5. InterruptedException:

- Unchecked: These exceptions are not compiled by the compiler at the compile-time. These are known at runtime
- Some exceptions:
- 1. ArithmeticException
- 2. ArrayIndexOutOfBoundsException: This occurs when we try to access invalid index element
- 3. NullPointerException: It occurs when we try to use null object

# How to handle exceptions
- 1. try-catch block
- 2. Finally block
- 3l. Throwing exceptons: throw, throws
- 4. Custom exception handling
- - Try block contains the code in which error can occur
- - Try block always followed by catch block or finally block
- - Catch block always executes when the exception occurs in the try block
- Finally: It always executes either exception occurs or not

# Throw and Throws
- Throw an exception from a method or block of code
'''
throw new Exception("This is exception");
'''
- throw keyword is returned inside a method or a block
- throw keyword is used within a method to indicate that an exception has occured

- Throws keyword: It is used in the signature of a method to indicate that this method might throw exceptions

## Assignment: Encapsulation

# super
- It is a reference variable
- It is used to refer parent class objects.
- It is basically usefull in polymorphism and inheritance
- Uses:
- 1. Accessing parent class methods: If a subclasss wants to access super class or parent class methods
- 2. Accessing parent class variables / fields: It can be used to acess using super keyword
- class A {
    int s = 10;
    class B extends A{
        int s = 20;
        voide m(){
            sout(super.s)
        }
    }
    class C{
        psvm (){
            B ob = new B();
            ob.m()|
        }
    }
}

- 3. Calling parent class constructor

# Java Custom Exception or User Defined exception
- It is defined by the user to handle specific applications requirements
- These Exceptions extends the exception class or RuntimeException class

## Use of user defined exceptions

- 1. To add, descriptive error message for debugging
- 2. To write application specifi error
- 3. Checked = Inherit Exception class, Unchecked: Inherit RuntimeException class

## How to create custom exceptions

- 1. Create a class that extends exception class or runtime exception class
- 2. Write constructors to initialize the exception with custom messages
- 3. Add methods to provide additional details about the exception [Optional]

* For Checked exceptions we need to throw exception using throws keyword

# I/O Basics in Java

- In Java I/O package helps user to perform all the I/O operations
- Java brngs various streams
- These streams support all the types of object, datatypes, characters files to execute I/O operations.
-       System.in
            |
            |
        Programs
        ____|____
        |        |
    System.out  System.err

- System.out: It is the basic standard output stream
- System.err: It is the basic standard error stream

## Types of Streams
- 1. Depending on time of operations
- - InputStream: These are used to read data that must be takenas a input from the user or src array or file or any peripheral device. Various input stream classes are:
a. DataInputStream
b. BufferedInputStream
c. FilteredInputStream
d. PushbackInputStream

- - OutputStream: These are used to write data that must be takenas a input from the user or src array or file or any peripheral device. Various input stream classes are:
a. DataOutputStream
b. BufferedOutputStream
c. FilteredOutputStream
d. PushbackOutputStream

- - 2. Depending on the type of input