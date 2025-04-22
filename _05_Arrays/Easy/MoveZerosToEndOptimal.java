package _05_Arrays.Easy;

public class MoveZerosToEndOptimal {
    public static void moveZerosToEndOptimal(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 5, 1, 0, 0, 2 };
        moveZerosToEndOptimal(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
