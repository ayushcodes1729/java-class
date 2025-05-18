public class thowImplement {
    public static void main(String[] args) {
        try {
            int num = 0;
            if (num == 0) {
                throw new ArithmeticException("num can't be zero");
            }
            int c = 2/num;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
