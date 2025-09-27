package _06_Binary_Search._3_BS_On_2D_Arrays;

public class SearchIn2DMatrix {

    private static boolean searchIn2DMatrix(int[][] matrix, int target) {
        int row, column, low, high, n, m;
        n = matrix.length;
        m = matrix[0].length;
        low = 0;
        high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            row = mid / m;
            column = mid % m;
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 }
        };
        int target = 31;
        System.out.println(searchIn2DMatrix(matrix, target));
    }

}
