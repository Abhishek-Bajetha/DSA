package _04_Sorting_Algorithms.Basic;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 6, 8 };

        System.out.print("Unsorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        insertionSort(arr);

        System.out.print("\nSorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
