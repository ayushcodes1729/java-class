interface A {
    void abs();
    void abs1();
    default void abs2(){
        System.out.println("This is default");
    }
}

public class basicInterface implements A{
    public void abs(){
        System.out.println("This is abstract method");
    }
    public void abs1(){
        System.out.println("This is abstract method-1");
    }
    
    public static void main(String[] args) {
        A objA = new basicInterface();
        objA.abs();
        objA.abs1();
        objA.abs2();
    }
}
