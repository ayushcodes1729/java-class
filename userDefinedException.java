public class userDefinedException extends Exception {
    public userDefinedException(String mes) {
        super(mes);
    }
    public static void main(String[] args) {
        int age = 20;
        try {
            if (age < 18) {
                throw new userDefinedException("Underage");
            } else {
                System.out.println("Cast vote");
            }
        } catch (userDefinedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}