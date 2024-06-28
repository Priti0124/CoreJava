package CoreJava.cond;

public class Condition {
    public static void main(String[] args) {
        //Conditions

        boolean canIWatchMovie = true;
        if(canIWatchMovie){
            System.out.println("i will not cry");
        } else{
            System.out.println("i will cry");
        }

        int a= 10;
        if (a % 2 == 2){
            System.out.println("Even Number");

        }else{
            System.out.println("Odd Number");
        }

        boolean b= true;
        b = !b;
        if(b){
            System.out.println(1);
        }else{
            System.out.println(2);
        }

    }

}
