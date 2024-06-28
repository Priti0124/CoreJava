package CoreJava.oops;


public class Equal3 {
    public static void main(String[] args) {

        // Strings are immutable in nature

        String s1= "Hello";
        String s2= " Guys";
        String s3= "Hello Guys";
        String s4= s1.concat(s2);

      // System.out.println(s1 == s2);
       System.out.println(s3.equals(s4));
        System.out.println(s3);
        System.out.println(s4);
    }
}
