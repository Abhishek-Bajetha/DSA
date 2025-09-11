package _05_Arrays.Medium;

public class RotateImage {
    public static int[][] rotateImage(int matrix[][]) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        for (int[] is : matrix) {
            for (int is2 : is) {
                System.out.print(is2 + "  ");
            }
            System.out.println();
        }
        System.out.println("\n-----------------");
        matrix = rotateImage(matrix);
        for (int[] is : matrix) {
            for (int is2 : is) {
                System.out.print(is2 + "  ");
            }
            System.out.println();
        }
    }
}
