package CoreJava;

public class JavaClassnew {
    public static void main(String[] args) {
        char c1 = '\u0000';
        System.out.println(c1);
        // \u0000 is a Unicode (mostly used in emoticons)

        //float f1 = 3.21;
        float f2 = 3.21234567656453142143576345f;

        //for float use f with the value in Java

        double d = 3.1112345675432122345643;

        //for long value we have to use long instead of float

        //Roll No - 989
        //Which one i have to use- byte, short, int?
       // byte r1 = 989; // out of range

        short r2 = 989; //Yes, within the range
        //we can use long also, but we have to save the memory or space of JVM
        //If we use long, then it will consume more space.

        System.out.println(Math.pow(2,15));
        //the above one is used to calculate the power

        //Distance between earth and moon
       // long distance_in_miles = 384000000000000000000;

        // name - we will use non-primitive data type
        String name = "Priti";

        // male/female - char
        char gender = 'M';

        // address - 2 parts (home and office)
        // Primitive data type is not possible

        String home = "rdyuilghf 67897t yuiouyt";
        String office = "rt78790iojknm lkuytryui 0987yghj";

        //Ideally both should be in one variable

        //Person- name, age, amount, address, balance, withdraw
        //multiple things- User Defined data type - class, array



    }
}
