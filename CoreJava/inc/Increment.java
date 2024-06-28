package CoreJava.inc;

public class Increment {
    public static void main(String[] args) {
        //Increment- Pre and Post
        // ++b is Pre
        // b++ is Post
        // b= b+1

        // 1- Pre

        int b = 99;
        // b= ++b - Increment me before assign.
        // b= b++ - Assign me before increment.

        // Left to right - Find the expression and value of b
        System.out.println(++b + ++b);
        // ++b = 99+1= 100
        // + is concatenation
        // ++b = b 100+1 exp= 101
        //Final value of b is 101

        System.out.println(b);

        //Another Example

        int c = 1;
        System.out.println(c + ++c + ++c + c);

        // Break down the code
        // c - 1
        // ++c - 1+1= 2
        // ++c - 2+1=3
        // c - 3


        // 2- Post- Assign me before increment.

        int d = 1;
        System.out.println(d++ +d + d++ + d);

        // Break down the code
        // d++ - 1+1=2 Exp- 1 and b-2
        // d - 2 Exp-2 and b-2
        // d++ - 2+1=3 Exp-2 and b-3
        // d - 3 Exp- 3






    }

}
