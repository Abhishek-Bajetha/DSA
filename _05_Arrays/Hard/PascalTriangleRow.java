package _05_Arrays.Hard;

public class PascalTriangleRow {
    public static void pascalTriangleRow(int row) {
        if (row <= 0)
            return;
        int res = 1;
        System.out.print(res + " ");
        for (int i = 1; i < row; i++) {
            res = res * (row - i);
            res = res / i;
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        pascalTriangleRow(5);
    }
}
