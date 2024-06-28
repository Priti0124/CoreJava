package CoreJava;

public class InterviewQues3 {
    public static void main(String[] args) {
// Triangle Classifier

        //Write a program that classifies a triangle based on it's side length
        //Given three input values representing the length of the sides
        //Determine if the triangle is Equilateral (all sides are equal)
        //Isosceles (exactly 2 sides are equal)
        // Or Scalene (no sides are equal)
        //Use if-else statement to classify the triangle.

        int side1= 10;
        int side2= 20;
        int side3= 10;

        if (side1 == side2 && side2 == side3){
            System.out.println("EQ");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("ISO");
        } else{
            System.out.println("Scalene");
        }




    }
}
