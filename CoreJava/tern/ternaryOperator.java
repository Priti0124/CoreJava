package CoreJava.tern;

public class ternaryOperator {
    public static void main(String[] args) {

        int age = 18;
        boolean canIWatchMovie = age>18 ? true:false;
        System.out.println(canIWatchMovie);

        //One more condition needs to be remembered

        float a = 20>19 ? 10.04f : 20.45f;
        System.out.println(a);

        String str = 10 > 20 ? "10" : "Twenty";
        System.out.println(str);

        int a1 = 10;
        int b1 = 20;
        //maximum number
        int max = a1>b1 ? a1 : b1;
        int min = a1<b1 ? a1 : b1;
        System.out.println(max);
        System.out.println(min);
    }
}
