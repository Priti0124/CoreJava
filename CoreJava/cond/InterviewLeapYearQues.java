package CoreJava.cond;

import java.util.Scanner;
public class InterviewLeapYearQues {
    public static void main(String[] args) {
// Create a program that determines whether a given year is leap year.
// A leap year is divisible by 4
// but not by 100 unless it is also divisible by 400
// Use an if-else statement to make this determination.

   // int year=2022;
    // (year % 4 == 0 && year % 100 ==/ 0)


        // Year to be checked
        int year = 1900;
        boolean leap = false;

        // If the year is divided by 4
        if (year % 4 == 0) {
            // If the year is a century
            if (year % 100 == 0) {
                // If year is divisible by 400, then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else {
                // If the year is not a century, it is a leap year
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
