import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int sum = 0;
        while (b >0) {
            sum = sum + b%10;
            b = b/10;
        }

        System.out.println(sum);
    }
}
