package CoreJava;

public class CastingType {
    public static void main(String[] args) {

        //This is a Widening type
        byte b = 10;
        int a = b;
        int a1 = (int)b; // JVM- you want to add small bucket to bigger bucket, that is possible
        System.out.println(a);
        System.out.println(a1);

        //This is a Narrowing type
        int c = 90;
        byte d = (byte)c; // Int is big basket - small basket
        System.out.println(d);

        int course = 10;
        float gst = 0.18f;
       // int total1 = course + gst;
        float total2 = course + gst;
        int total3 = course + (int)gst;

      //  System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);



    }
}
