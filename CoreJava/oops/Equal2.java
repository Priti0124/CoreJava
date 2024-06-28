package CoreJava.oops;

public class Equal2 {
    public static void main(String[] args) {

        String s1= "My name is Priti";
        String s2= "My name is Priti";
        String s3= new String("my name is Priti");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
