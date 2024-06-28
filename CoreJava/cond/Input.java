package CoreJava.cond;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //how to get input from the user?

        System.out.println("enter the value of a,b,c\n I will give you the maximum of three");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        System.out.println("Your inputs are" + a + " " + b + " " + c);

        if(a > b && a> c){
            System.out.println("Max is" + a);
        }

        if(b > a && b> c) {
            System.out.println("Max is" + b);
        }

        if(c > a && c> b) {
            System.out.println("Max is" + c);
        }

    }
}
