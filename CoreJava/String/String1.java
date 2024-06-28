package CoreJava.String;

public class String1 {
    public static void main(String[] args) {


        String s1= "Priti"; // This will be stored in String Pool
        String s2= new String("Priti"); //This will be stored in Heap Area
        String s3= "  Priti  ";
        // s1 -> s3 ="Priti" will be stored in String Pool

        String s4= "priti"; //This will be stored in another String.
        String s5="Priti"; //SP- s5 and s3 will point to s1 only

        System.out.println(s1.charAt(4));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(2));

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());

        System.out.println(s1.equalsIgnoreCase("Prti"));
        System.out.println(s1.equalsIgnoreCase("Priti"));

        System.out.println(s1.contains("a"));
        System.out.println(s1.length());
        System.out.println(s1.indexOf("i"));

        String s6= "Priti-Kumari";
        System.out.println(s6.split("-")[0]);
        System.out.println(s6.split("-")[1]);



    }
}


