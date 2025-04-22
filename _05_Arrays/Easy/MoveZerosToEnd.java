package _05_Arrays.Easy;

import java.util.ArrayList;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int arr[]) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 2 };
        moveZerosToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
