package _05_Arrays.Medium;

import java.util.Arrays;

public class Two_Sum {
    public static int[] two_Sum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left, right};
            }
            else if (arr[left] + arr[right] >= target) {
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] newArr = two_Sum(arr, 26);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
