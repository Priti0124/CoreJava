package CoreJava.loop;

public class ForLoop5 {
    public static void main(String[] args) {
        // I want to print a pattern like below:
        // *
        // **
        // ***
        // ****
        // *****
        
        int n =5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               // System.out.println(i);
               // System.out.print(j);
                System.out.print("*");
                
            }
            System.out.println();
            
        }

        // *****
        // ****
        // ***
        // **
        // *

        int m = 5;
        for (int p = m; p >= 1 ; p--) {
            for (int q = 1; q <= p; q++) {
               // System.out.println(p);
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
