import java.io.*;

public class fileRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("./file.txt");
        FileOutputStream fout = new FileOutputStream("./file1.txt", true);
            int temp;
            while ((temp = fin.read()) != -1) {
                fout.write(temp);
                System.out.print((byte) temp);
            }
            fin.close();
            fout.close();
    }
}
