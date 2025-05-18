class  A{
    public int a = 10;
    public int b = 20;
}
class  B extends A{

    public int mult(int x, int y){
        return x*y;
    }
}
public class multiLevel extends B{
    public static void main(String[] args) {
        B objB = new B();
        int x = objB.a;
        int y = objB.a;
        int result = objB.mult(x, y);
        System.out.println(result);
    }
}
