package CoreJava;

public class Literals {
    public static void main(String[] args) {

        //char c1 = '123';
        System.out.println();
        //in the above code '123' is literal/value

        //whole literals - 12, -23 are allowed
        int age = 28;

        //Floating literal- 0.12, -23.12 are allowed
        float f1 = 23;
        System.out.println(f1);
        float f2 = 23.12f;
        System.out.println(f2);

        // '\b' is used for backslash
        // '\n' is used for new line
        // '\t' is used for tab/space between 2 characters


        int b1 = 123; //it is integer
        int b2 = 0101; // 0 it is octal
        int b3 = 0Xface; // 0X it is hexadecimal
        int b4 = 0b101; // 0b binary numbers
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}
