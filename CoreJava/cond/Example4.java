package CoreJava.cond;

public class Example4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}
