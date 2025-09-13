package _05_Arrays.Hard;

public class PascalTriangleElement {
    public static int pascalTriangleElement(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            System.out.println("above: "+ res);
            res = res / (1 + i);
            System.out.println("after divide: "+ res);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangleElement(4, 2));
    }
}