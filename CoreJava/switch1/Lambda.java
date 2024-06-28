package CoreJava.switch1;

public class Lambda {
    public static void main(String[] args) {
        //Lambda Expression

        int item = 003;
        switch (item){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 005 -> System.out.println("005");
            default -> System.out.println("Default");
        }



    }
}
