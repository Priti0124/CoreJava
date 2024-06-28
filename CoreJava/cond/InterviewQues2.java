package CoreJava.cond;

import java.util.Scanner;

public class InterviewQues2 {
    public static void main(String[] args) {

        //Grade Calculator
        //Write a program that calculates and displays the letter grade for
        // a given numerical score (e.g, A, B, C, D, and E)
        //Based of the following grading scale:
        //A = 90-100
        //B = 80-89
        //C = 70-79
        //D = 60-69
        //E = 0-59

        //take the input from the user
        //grade > 90 and grade < 100, then print A
        // else if grade > 80 and grade < 89, then print B

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");

        int score= sc.nextInt();
        String grade= null;

        if(score >= 90 && score <= 100){
            grade= "A";
        }
       else if(score >= 80 && score < 90){
            grade= "B";
        }
       else if(score >= 70 && score < 80){
            grade= "C";
        }
       else if(score >= 60 && score < 70){
            grade= "D";
        }
       else{
            grade= "E";
        }
        System.out.println("Your grade is " + grade);
    }
}
