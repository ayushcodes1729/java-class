class A {
    public void M1(){
        System.out.println("This is a super class");
    }
}

public class inheritance extends A{
    public static void main(String[] args) {
        A ob = new A();
        ob.M1();
    }
}
