import java.util.Arrays;

public class MatrixManipulation1 {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix must be 2x2 to find the determinant.");
            return 0;
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    public static double determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            System.out.println("Matrix must be 3x3 to find the determinant.");
            return 0;
        }
        double det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                   - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                   + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Determinant is 0, inverse does not exist for the 2x2 matrix.");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }
    
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Determinant is 0, inverse does not exist for the 3x3 matrix.");
            return null;
        }

        double[][] inverse = new double[3][3];
        inverse[0][0] = (m[1][1] * m[2][2] - m[2][1] * m[1][2]) / det;
        inverse[0][1] = (m[0][2] * m[2][1] - m[0][1] * m[2][2]) / det;
        inverse[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;
        inverse[1][0] = (m[1][2] * m[2][0] - m[1][0] * m[2][2]) / det;
        inverse[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inverse[1][2] = (m[1][0] * m[0][2] - m[0][0] * m[1][2]) / det;
        inverse[2][0] = (m[1][0] * m[2][1] - m[2][0] * m[1][1]) / det;
        inverse[2][1] = (m[2][0] * m[0][1] - m[0][0] * m[2][1]) / det;
        inverse[2][2] = (m[0][0] * m[1][1] - m[1][0] * m[0][1]) / det;

        return inverse;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    public static void printMatrix(double[][] matrix) {
        if (matrix == null) return;
        for (double[] row : matrix) {
            System.out.print("[");
            for(int i=0; i < row.length; i++){
                System.out.printf("%.2f", row[i]);
                if(i < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("Original 2x2 Matrix:");
        printMatrix(matrix2x2);
        
        System.out.println("\nTranspose of 2x2 Matrix:");
        printMatrix(transposeMatrix(matrix2x2));
        
        System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        System.out.println("\nInverse of 2x2 Matrix:");
        printMatrix(inverse2x2(matrix2x2));
        
        System.out.println("\n----------------------------------\n");
        
        System.out.println("Original 3x3 Matrix:");
        printMatrix(matrix3x3);
        
        System.out.println("\nTranspose of 3x3 Matrix:");
        printMatrix(transposeMatrix(matrix3x3));
        
        System.out.printf("\nDeterminant of 3x3 Matrix: %.2f%n", determinant3x3(matrix3x3));

        System.out.println("\nInverse of 3x3 Matrix:");
        printMatrix(inverse3x3(matrix3x3));
    }
}
