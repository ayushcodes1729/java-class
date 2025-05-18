class Div {
    public void div(int num) throws ArithmeticException {
        int c = 2/num;
        System.out.println(c);
    }
}

public class throwsImplement {
    public static void main(String[] args) {
        Div objA = new Div();
        try {
            objA.div(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
