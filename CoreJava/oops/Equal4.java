package CoreJava.oops;

public class Equal4 {
    public static void main(String[] args) {
        //CompareTo function will compare the Unicode value of characters
        //If value is equal, output will be 0
        //If value is not equal, output will be less than 0

        String s1= "ABC";
        String s2= "ABC";
        String s3= "ABc";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
