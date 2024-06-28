package CoreJava.inc;

public class Decrement {
    public static void main(String[] args) {

        //Decrement

        int b=10;
        System.out.println(b-- + --b);

        //Break Down
        //b-- Exp-10 and b-9
        //--b Exp-8 and b- 8

        int d=101;
        System.out.println(d--);
        System.out.println(--d);
        System.out.println(d);
    }
}

