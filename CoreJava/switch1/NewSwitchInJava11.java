package CoreJava.switch1;

public class NewSwitchInJava11 {
    public static void main(String[] args) {
//JDK > 11 New Switch Statment

        int item = 006;
        switch (item){
            case 001,002,003:
                System.out.println("from 1 to 3");
                break;
            case 004,005,006:
                System.out.println("from 4 to 6");
                break;
            case 007:
                System.out.println("Only 7");
                break;
            default:
                System.out.println("Invalid");
        }




    }
}
