import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./file.txt");
        int F;
        while ((F = fr.read()) != -1) {
            System.out.print((char) F);
        }
    }
}
