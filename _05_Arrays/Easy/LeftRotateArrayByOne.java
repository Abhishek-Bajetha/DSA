package _05_Arrays.Easy;

public class LeftRotateArrayByOne {
    static void leftRotateArrayByOne(int arr[]) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : arr) {
            System.out.print(i+" ");
        }
        leftRotateArrayByOne(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
