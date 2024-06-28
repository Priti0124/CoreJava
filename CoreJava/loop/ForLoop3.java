package CoreJava.loop;

public class ForLoop3 {
    public static void main(String[] args) {
        //go from 1 to 10
        // if you find i = 5, break

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5){
                System.out.println("Found 5");
                break;
            }

        }
        System.out.println("End");
    }
}
