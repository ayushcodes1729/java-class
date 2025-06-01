# Java New Features

## Lambda Expressions
- Lambda expressions are short blocks of code that takes in parameters and return a value.
- These are anonymous functions that can be used to implement functional interfaces.
- They don't need a name and can be implemented in the body of the method.
- It represesnts instance of a function interface.
- Lambda expressions can be used to provide the implementation of the abstract method of a functional interface.

### Functions of Lambda Expressions

- Code as data: Lambda expressions allow you to treat code as data, enabling you to pass behavior as parameters.
- Class Independence: Lambda expressions are not tied to a specific class, allowing for more flexible and reusable code.
- Pass and Execute: Lambda expressions can be passed as parameters to methods and executed.
- (parameter) -> {Body of lambad expression}
- eg. (int a, String b) -> {System.out.println(a + b);}

## Types of Lambda Expressions
- **No Parameter**: `() -> { System.out.println("Hello World"); }`
- **Single Parameter**: `(int x) -> { System.out.println(x); }`
- **Multiple Parameters**: `(int x, int y) -> { System.out.println(x + y); }`

## Functional Interface
- A functional interface is an interface that contains only one abstract method.
- It can have multiple default or static methods.
- Functional interfaces can be implemented using lambda expressions.
- Comparator is a functional interface that can be used to compare two objects.     

## Default Interface Methods
- Default methods are declared in an interface with the `default` keyword.
- Default methods are methods defined in an interface with a body.
- They allow you to add new methods to an interface without breaking existing implementations.
- Default methods are implicitly public and can be overridden in implementing classes.
- Syntax: 
```java
interface MyInterface {
    default void myDefaultMethod() {
        System.out.println("This is a default method");
    }
}
```
- Multiple inheritance is allowed with default methods, but it can lead to ambiguity if two interfaces provide the same default method. In such cases, the implementing class must override the method to resolve the ambiguity.
## Static Interface Methods
- Static methods in interfaces are declared with the `static` keyword.
- Static interface methods can be called without an instance of the interface.

- It has 4 kinds of functional interfaces which can be used in multiple situations.
- 1. Consumer<T>: Represents an operation that accepts a single input argument and returns no result. Some variants of Consumer<T> are:
  - DoubleConsumer: Accepts a double input.
  - IntConsumer: Accepts an int input.
  - LongConsumer: Accepts a long input.
  - BiConsumer<T, U>: Accepts two input arguments and returns no result.
  Syntax: Consumer<String> consumer = (s) -> System.out.println(s);
- 2. Predicate<T>: Represents a boolean-valued function of one argument. Some variants of Predicate<T> are:
  - DoublePredicate: Accepts a double input and returns a boolean.
  - IntPredicate: Accepts an int input and returns a boolean.
  - LongPredicate: Accepts a long input and returns a boolean.
  - BiPredicate<T, U>: Accepts two input arguments and returns a boolean.
  Syntax: Predicate<String> predicate = (s) -> s.length() > 5;
- 3. Function<T, R>: Represents a function that accepts one argument and produces a result.
    Some variants of Function<T, R> are:
    - DoubleFunction<R>: Accepts a double input and produces a result.
    - IntFunction<R>: Accepts an int input and produces a result.
    - LongFunction<R>: Accepts a long input and produces a result.
    - BiFunction<T, U, R>: Accepts two input arguments and produces a result.
    Syntax: Function<String, Integer> function = (s) -> s.length();
- 4. Supplier<T>: Represents a supplier of results, providing a value without any input.
    Some variants of Supplier<T> are:
    - DoubleSupplier: Produces a double value.
    - IntSupplier: Produces an int value.
    - LongSupplier: Produces a long value.
    Syntax: Supplier<String> supplier = () -> "Hello World";

# Base64 encoding and Decoding

- Base64 is an encoding scheme that converts binary data into a text representation using a set of 64 characters.
- It is used to encode binary data into a string format that can be easily transmitted over text-based protocols without any data loss.
- Encoding
      |
      |
  Actual Data = "This"
      |
      |
  Binary Data(Bytes stream)
      |
      |
  Text (encoded data)
- The output is mapped to a set of 64 characters, which includes uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), and two additional characters (+ and /). (A-Za-Z0-9+/)
- The basic encoding means no line added to the output.
- Encodin and decding is present in java.util.Base64 class.
- getEncoder() method is used to get the encoder object.
'''java
import java.util.Base64;  
encdoeToString("actual data".getBytes());
'''
- getBytes() method is used to convert the string to bytes.
- String Base = Base64.getEncoder().encodeToString("actual data".getBytes());
- getDecoder() method is used to get the decoder object.
