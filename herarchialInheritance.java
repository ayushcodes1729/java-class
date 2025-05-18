class A {
    static int square(int x){
        return x*x;
    }
}

class B extends A {
    static int x = 10;
    static int res1 = A.square(x);
}

public class herarchialInheritance extends A{
    public static void main(String[] args) {
        int res2 = A.square(12);
        int resB = B.res1;
        System.out.println(res2);
        System.out.println(resB);
    }
}
