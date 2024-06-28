package CoreJava.switch1;

public class switchInterview {
    public static void main(String[] args) {

        //two same cases are not allowing in switch

        int a = 98;
        switch (a){
            case 98:
                System.out.println("Hi");
            case 99:
                System.out.println("Bye");
        }

        byte b = 20;
        switch (b){
            case 30:
                System.out.println("Thirty");
            case 127:
                System.out.println("One Twenty Seven");
        }

        //In the 2nd code, there is no condition, that's why no output is coming


    }


}
