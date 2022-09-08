public class Task5 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int[][] matrix1 = new int[x][y];
        createMatrix(matrix1);
        System.out.println("Given matrix:");
        printMatrix(matrix1);

        int[][] matrix2 = new int[y][x];
        transposeMatrix(matrix1, matrix2);
        System.out.println("Transposed matrix:");
        printMatrix(matrix2);
    }

    public static void createMatrix (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }
    }

    public static void printMatrix (int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
           System.out.println();
        }
        System.out.println();
    }

    public static void transposeMatrix (int[][] matrix1, int[][] matrix2){
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = matrix1[j][i];
            }
        }
    }
}
