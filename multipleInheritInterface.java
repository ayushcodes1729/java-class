interface A {
    void circle();
}

interface B {
    void rect();
}

public class multipleInheritInterface implements A,B{
    public void circle(){
        System.out.println("This is A");
    }
    public void rect(){
        System.out.println("This is B");
    }
    public static void main(String[] args) {
        multipleInheritInterface objC = new multipleInheritInterface();
        objC.circle();
        objC.rect();
    }
}
