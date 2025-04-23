package _05_Arrays.Easy;

public class FindMissingNumberInSortedArray {
    public static int findMissingNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i + 1)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7 };
        int missing = findMissingNumber(arr);
        System.out.println(missing);
    }
}
