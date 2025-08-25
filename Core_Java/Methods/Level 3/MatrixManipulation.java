import java.util.Arrays;

public class MatrixManipulation {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random numbers 0-9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
            return null;
        }
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            System.out.println("The number of columns in the first matrix must equal the number of rows in the second for multiplication.");
            return null;
        }
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix(2, 3);
        int[][] matrix2 = createRandomMatrix(2, 3);
        int[][] matrix3 = createRandomMatrix(3, 2);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        System.out.println("\nMatrix 3:");
        printMatrix(matrix3);

        System.out.println("\nAddition (Matrix 1 + Matrix 2):");
        int[][] sum = addMatrices(matrix1, matrix2);
        printMatrix(sum);

        System.out.println("\nSubtraction (Matrix 1 - Matrix 2):");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        printMatrix(difference);

        System.out.println("\nMultiplication (Matrix 1 * Matrix 3):");
        int[][] product = multiplyMatrices(matrix1, matrix3);
        printMatrix(product);
    }
}
