package CoreJava;

public class ExamplesOfOperators {
    public static void main(String[] args) {
        System.out.println(2147483647 + 1);
        //output is in negative because this 2147483647 is the maximum range of Integer
        //then the value will go reverse i.e. in negative

        byte a1 = 127;
        System.out.println(a1 + 1); // Output is 128
        //Now this is byte + Int is converted into Integer

        float f = 30 / 0.3f;
        System.out.println(f);
        // Int + Float = Float only

        System.out.println(10/3); //Output will be integer
        System.out.println(10/3.1); // output will be in float


    }
}
