public class substring {
    public static void main(String[] args) {
        String a = "    This is CSIT     ";
        String b = "This is CSIT";
        String s1= a.substring(1,10);
        String s2= a.substring(1,10);
        char character = a.charAt(1);
        // System.out.println(character);
        // Boolean res = s1.equals(s2);
        // System.out.println(res);
        // int bool = a.compareTo(b);
        // System.out.println(bool);
        System.out.println(a);
        System.out.println(a.trim());
        char [] arr = a.toCharArray();
        System.out.println(arr);
        // System.out.println(anotherString);
    }
}
