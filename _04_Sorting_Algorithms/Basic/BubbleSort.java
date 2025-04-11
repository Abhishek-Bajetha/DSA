package _04_Sorting_Algorithms.Basic;

public class BubbleSort {
    static void bubbleSort(int arr[]) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 6, 8, 1, 3, 9, 6 };

        System.out.print("Unsorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        bubbleSort(arr);

        System.out.print("\nSorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
