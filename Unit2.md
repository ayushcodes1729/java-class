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
- - 3. Depending on the type of files

- ByteStreams: This class is used to read data byte by byte
- - This has 2 classes for input: FileInputStream and for output: FileOutputStream
- - Some ByteStream classes are BuffereInputStream, DataInputStream, PrintStream, BufferedOutputStream, DataOutputStream

- - We use IO package to import IO Streams ''' import java.io.* '''
- - FileInputStream has read() method to read data byte by byte
- - When read method is used with input string it reads a single byte of data from input stream. It returns an integere representing the unsigned byte value(0-255). If the end of file is reached it returns -1
- - If read() method is used with FileReader class it reads a single character from the input stream. It returns an integer representing the character's unicode value(0-65535). If the end of file is reached it returns -1.
- - CharacterStream allows to read and writer character data
- - In java, character data is represented in unicode format
- - Some character stream classes are BufferedReader, InputStreamReader, FileReader, OutputStreamReader, PrintWriter, BufferedWriter, FileWriter, Reader, Writer
- - FileOutputStream has write() method to write data byte by byte

# Multithreading

## Process
- It is a program in execution

## Thread
- It is a lightweight process
- It is a sequence of instructions that can be executed independently

## Multithreading
- It is a process of executing multiple or programs threads simultaneously for maximum utilization of CPU.

## Life Cycle of Thread
- It refers to the various states of a thread during its execution
- 1. New: When a thread is created but not yet started
- 2. Runnable: When a thread is in the ready state and waiting for CPU to be assigned
- 3. Waiting: When a thread is waiting for another thread to complete its execution
- 4. Blocked: When a thread is waiting for a resource that is currently being used by another thread
- 5. Timed Waiting: When a thread is waiting for a specific period of time
- 6. Terminated: When a thread has completed its execution or has been terminated


# Multithreading

- When a thread is created it is in the new state
- When the start() method is called, the thread enters the runnable state
- The thread scheduler selects a thread from the runnable state and moves it to the running state
- Whenever the join() method is called on a thread instance, the main thread enters the waiting state for the running thread to complete
- Once the thread run method is completed, the thread enters the terminated state

## Thread Creation
- 1. By extending Thread class
- 2. By implementing Runnable interface

I. Thread class
- - Thread runs in java by using Thread class which provides constructors and methods to create and perform operations on threads
- - Extending Thread class that can implement runnable interface
- - Some methods of Thread class are:
- - 1. run(): It is used to perform the operations of the thread
- - 2. join(): It is used to join the thread with the main thread. Waits for the thread to die
- - 3. interrupt(): It is used to interrupt the thread
- - 4. interrupted(): It is used to check whether the thread is interrupted or not
- - 5. setName(string name): It is used to set the name of the thread
- - 6. sleep(long millis): It is used to suspend the thread for a specified time
- - 7. start(): It is used to start the thread
- - 8. getState(): It is used to get the state of the thread
- - 9. getName(): It is used to get the name of the thread
- - 10. getId(): It is used to get the id of the thread
- - 11. getReference(): It is used to get the reference of the thread
- - 12. getStackTrace(): It is used to get the stack trace of the thread
- - 13. wait(): It is used to wait for the thread to die

## Steps to create a thread
- 1. Create a class that extends Thread class
- 2. Override the run() method to define the code that will be executed by the thread
- 3. Create an instance of the class
- 4. Call the start() method on the instance to start the thread

## By Implementing Runnable Interface
- - Runnable interface lies in java.lang package, java.lang.Runnable. This interface is implemented by a class whose instances are intended to be executed by a thread
- - import runnable interface
- - Creeate a class that implements Runnable interface
- - Override the run() method to define the code that will be executed by the thread
- - Create an instance of the class and pass implementor to the Thread
- - Thread has a constructor that takes a Runnable object as an argument

## Threads Priority
- - Thread priority is a number between 1 and 10
- - In multithreading, thread priority is used to decide the order in which threads are scheduled for execution
- - Priority can be given by a programmer explicitly or by the JVM while creating the thread.
- - When a thread is created, it is assigned a default priority of 5
- - The minimum priority is 1 and the maximum priority is 10

## Join method
- - The join() method is used to wait for a thread to complete its execution
- - syntax: thread.join() or thread.join(long millis)