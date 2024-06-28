package CoreJava.String;

public class String2 {
    public static void main(String[] args) {
        // String Buffer

        String s1="Priti";
        String s2="Kumari";
        for (int i = 0; i < 1000; i++) {
            s2= s1+s2;
            System.out.println(s2);
// the above one is a bad approach.
        }

        // here it comes String Buffer
        StringBuffer s3 = new StringBuffer("Priti");
        for (int j = 0; j < 1000; j++) {
         s3.append(s2);
        }
    }
    // Conclusion- Use String Buffer when values changes a lot
    // Less time and Thread Safe


// String Builder- Less time but no Thread safety (Only difference)

}
