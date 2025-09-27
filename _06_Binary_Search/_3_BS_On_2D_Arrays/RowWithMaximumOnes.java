package _06_Binary_Search._3_BS_On_2D_Arrays;

import _06_Binary_Search._1D_Arrays.LowerBoundInArray;

public class RowWithMaximumOnes {

    public static int rowWithMaximumOnes(int[][] mat) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < mat[0].length; i++) {
            // here i have used the lower bound method using the binary search
            int size = mat[i].length - LowerBoundInArray.lowerBoundInArray(mat[i], 1);
            if (size > max) {
                max = size;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 0 },
                { 0, 0 }
        };
        System.out.println(rowWithMaximumOnes(mat));
    }
}