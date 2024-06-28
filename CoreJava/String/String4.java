package CoreJava.String;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        //Reverse a String

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb1;
        sb1= new StringBuilder(sc.next());
        sb1.reverse();
        System.out.println(sb1);

    }
}
