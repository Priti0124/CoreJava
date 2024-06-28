package CoreJava.oops;

public class EqualOperator {
    public static void main(String[] args) {

        // Interview Question

        // == Operator checks if 2 string references point to the same memory location.

        String s1= "Priti";
        String s2= "Priti";
        String s3= new String("Priti");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //Equal method compares the actual value of the string,
        // checking if they contain the same sequence of characters.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
