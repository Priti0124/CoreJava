package CoreJava;

import java.sql.Struct;

public class Operators {

    public static void main(String[] args) {

        //Binary Operators- +, -, *, /, %
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);

        // % is called as mode operator
// ctrl D is shortcut of duplicate


        //Unary Operators
        // Part 1= +, -, ! (not of), ~ (tilt or one's compliment)
        int a1 = 10;
        System.out.println(+a1);
        System.out.println(-a1);
        boolean b1 = true;
        System.out.println(!b1);

        int d = 10;
        System.out.println(~d); // 10- 0101 > 1010 (-1)

        //Part 2- Increment (Post and Pre)

        byte b2 = 10;
        byte b3 = 20;
        System.out.println(b2+b3); //result will be integer

        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c1+c2);
        //in the above example, first the characters value will be converted into ASCII value and then addition will happen

        String s1 = "Priti";
        String s2 = "Kumari";
        System.out.println(s1+s2);

        int i1 = 10;
        int i2 = 20;
        System.out.println(i1+i2);

        System.out.println(i1+i2+s1+s2);
        //flow always be from left to right
        //first i1+i2=30 will be done then string will be added

        System.out.println(s1+s2+i1+i2);
        //in the above one, string + int = String

        System.out.println(s1+s2+(i1+i2));
        //as per the BOD MASS formula, addition will happen first
        //PritiKumari + 30

        boolean o = !true;
        boolean p = !false;
        System.out.println(o);
        System.out.println(p);

        String name1 = "Priti";
        String name2 = "10";
        System.out.println(name1+10+34); //Priti1034
        System.out.println(10+34+name1); //44Priti
        // Behave left to right - First is Int (sum), First is String (Concatenation)








    }

}
