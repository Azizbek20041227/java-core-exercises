package matrixs;

public class Matrix10 {
    public static void main(String[] args) {

        int m = 5, n = 4;

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}