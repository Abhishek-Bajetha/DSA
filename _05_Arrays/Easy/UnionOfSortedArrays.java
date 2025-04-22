package _05_Arrays.Easy;

import java.util.HashSet;

public class UnionOfSortedArrays {
    public static int[] unionOfSortedArrays(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int temp[] = new int[set.size()];
        for (int i : set) {
            temp[j] = i;
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 7, 8 };
        int arr2[] = { 7, 8, 9, 10, 13, 15 };
        int union[] = unionOfSortedArrays(arr1, arr2);
        for (int i : union) {
            System.out.print(i + " ");
        }
    }
}
