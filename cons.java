import java.util.function.Consumer;
import java.util.function.Function;

public class cons {
    public static void con(int a){
        System.out.println("Value of a: " + a);
    }
    public static void main(String[] args) {
        Function<Integer, Integer> func = (a) -> a/2;
        System.out.println("Answer is: " + func.apply(10));
    }
}