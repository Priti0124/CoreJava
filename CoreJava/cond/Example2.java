package CoreJava.cond;

public class Example2 {
    public static void main(String[] args) {
        if(true){
            System.out.println(1);
        }
        if(true){
            System.out.println(2);
        }
        if(false){
            System.out.println(3);
        }
        if(true){
            System.out.println(4);
        }else{
            System.out.println(5);
        }
    }
}
