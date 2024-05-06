package week2;


//             Transpose Matrix


public class MatrixTranspose {
    public static void transpose(int [][] array) {
        // transpose matrix element
        int row = array.length;
        int col = array[0].length;

        // created tarnspose matrix
        int[][] transposed = new int[col][row];

        //  [2][3] >>>> [3][2] matrix
        for (int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        // transpose matris  = > A=>A^t
        System.out.println("Transpose : ");
        for (int i=0; i<col; i++) {
            for (int j=0; j<row; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // created matrix
        int[][] matrix = new int[2][3];

        // add number for the array
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number++;
            }
        }
        // original matrix
        System.out.println("Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // transpose method calling
        transpose(matrix);

    }
}

