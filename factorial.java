import java.util.Scanner;

public class factorial {
    int fact(int n){
        if (n ==0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial obj = new factorial();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative integers");
        }
        else{
            int result = obj.fact(num);
            System.out.println(result);
        }
        sc.close();
    }
}
