package CoreJava.switch1;

import java.util.Scanner;

public class IntvwQues {
    public static void main(String[] args) {
        // Simulate a traffic light with 3 possible states: Red, Yellow, Green
        // Write a program that takes an integer representing the
        // current state of the traffic light and prints the next state.

        // 1. Red -> Yellow
        // 2. Yellow -> Green
        // 3. Green -> Red

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-3 which state you are in");
        int state = sc.nextInt();

        switch (state){
            case 1:
                System.out.println("Next will be Yellow");
                break;
            case 2:
                System.out.println("Next will be Green");
                break;
            case 3:
                System.out.println("Next will be Red");
                break;
            default:
                System.out.println("Invalid State");
        }



    }
}
