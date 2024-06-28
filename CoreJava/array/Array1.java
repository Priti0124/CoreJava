package CoreJava.array;

public class Array1  {
    public static void main(String[] args) {
        int [] marks= new int[3];
        int [] marks2= {1,2,3};

        // 2D or Matrix

        int [][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        //print all the elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println(" ");
            
        }

    }
}
