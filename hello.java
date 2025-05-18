import static java.lang.System.*;
public class hello {

    hello(){
        out.println("Hello World");
    }

    hello(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        // hello myObject = new hello();
        hello myNewObject = new hello(10,20);
        var a =50;
        System.out.println(a);
        // System.out.println(myObject);
    }   
}