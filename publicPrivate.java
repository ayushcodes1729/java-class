public class publicPrivate {
    protected static int a = 11;
    private int b =10;
    public static void main(String[] args) {
        publicPrivate bobj = new publicPrivate();
        System.out.println(a);
        System.out.println(bobj.b);
        int answer = A.square(a);
        System.out.println(answer);
        System.out.println(A.cool);
    }
}

class A {
    protected static int cool = 6001;
    static int square(int a){

        return a*a;
    }

}
