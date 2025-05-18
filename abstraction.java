abstract class abs {
    void nonAbst(){
        System.out.println("This is non-abstract method");
    }
    abstract void abst();
}

public class abstraction extends abs{
    void abst(){
        System.out.println("This is abstract");
    }
    public static void main(String[] args) {
        abstraction ob = new abstraction();
        ob.abst();
        ob.nonAbst();
    }
}
