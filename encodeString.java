import java.util.Base64;

public class encodeString {
    public static void main(String[] args) {
        String str = "Hello World";
        String base = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println("Encoded String: " + base);
        String decoded = new String(Base64.getDecoder().decode(base));
        System.out.println("Decoded String: " + decoded);
    }
}
