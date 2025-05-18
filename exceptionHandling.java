public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b =10;
            int c = b/a;
            System.out.println(c);
        }
        finally {
            System.out.println("I am a multilingual programmer");
        }
    }
}