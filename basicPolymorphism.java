public class basicPolymorphism {
    static double area(double s){
        return s*s;
    }
    static double area(int r){
        return Math.PI*r*r;
    }
    static double area(double l, double b){
        return l*b;
    }
    public static void main(String[] args) {
        double squareArea = area(25.0);
        double circleArea = area(20);
        double rectArea = area(25.0);
        System.out.println(squareArea);
        System.out.println(rectArea);
        System.out.println(circleArea);
    }
}
