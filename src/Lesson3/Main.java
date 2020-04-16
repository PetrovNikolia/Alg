package Lesson3;

public class Main {
    public static void main(String[] args) {
        String str = new String("Go to home");

        System.out.println(reverseString(str));
    }
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
