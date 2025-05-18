public class parameterizedMethods {
    public static void main(String[] args) {
        A ob = new A();
        ob.name("Ayush", 1);
    }
}

class A {
    void name(String a, int b){
        System.out.println(a+" "+b);
    }
}
