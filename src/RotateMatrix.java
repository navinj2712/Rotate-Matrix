import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter the no. of column : ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] outputMatrix = findRotateMatrix(matrix);
        for (int i = 0; i < outputMatrix.length; i++){
            for (int j = 0; j < outputMatrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] findRotateMatrix(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][M - j - 1];
                matrix[i][M - j - 1] = temp;
            }
        }
        return matrix;
    }

}
