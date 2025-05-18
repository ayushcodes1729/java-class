public class staticNonStatic {

        String s = "This is a class";
        int a = 10;
        static int b= 5;
        static String c = "This is static";
    public static void main(String[] args) {
        staticNonStatic obj = new staticNonStatic();
        String s1 = "Ayush";
        String s2= s1;
        System.out.println(b); //static member
        System.out.println(c); //non-static member
        System.out.println(obj.a);
        System.out.println(obj.s);
    }
}
