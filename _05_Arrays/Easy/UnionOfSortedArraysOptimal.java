package _05_Arrays.Easy;

import java.util.ArrayList;

public class UnionOfSortedArraysOptimal {
    public static int[] unionOfSortedArraysOptimal(int arr1[], int arr2[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (arr1.length > i && arr2.length > j) {
            if (arr1[i] <= arr2[j]) {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++;
            } else {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                }
                j++;
            }
        }
        while (arr1.length > i) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
                temp.add(arr1[i]);
            }
            i++;
        }
        while (arr2.length > j) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
                temp.add(arr2[j]);
            }
            j++;
        }
        j = 0;
        int union[] = new int[temp.size()];
        for (int x : temp) {
            union[j] = x;
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 7, 8 };
        int arr2[] = { 7, 8, 9, 10, 13, 15 };
        int union[] = unionOfSortedArraysOptimal(arr1, arr2);
        for (int i : union) {
            System.out.print(i + " ");
        }
    }
}
