interface lamb {
    void disk(int a, int b);    
}

public class lambda {
    public static void main(String[] args) {
        lamb l2 = (a, b) -> System.out.println("Lambda expression with single parameter: " + (a + b));
        l2.disk(10, 20);
    }
}