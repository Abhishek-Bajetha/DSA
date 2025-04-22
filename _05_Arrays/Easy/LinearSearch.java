package _05_Arrays.Easy;

public class LinearSearch {
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 5, 1, 0, 0, 2 };
        int target = 9;
        int i = linearSearch(arr, target);

        if (i == -1) {
            System.out.println("Not found: " + target);
        } else {
            System.out.println(arr[i] + " is present at " + i + " index");
        }
    }
}
