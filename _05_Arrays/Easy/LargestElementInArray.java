package _05_Arrays.Easy;

public class LargestElementInArray {
    static int largestElementInArray(int arr[]) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int arr[] = { 1,  3, 8, 9, 6 };
        System.out.println(largestElementInArray(arr));
    }
}
