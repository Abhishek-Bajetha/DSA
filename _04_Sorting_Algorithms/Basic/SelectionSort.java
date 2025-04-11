package _04_Sorting_Algorithms.Basic;

public class SelectionSort {
    static void selectionSort(int arr[]) {
        int s;
        for (int i = 0; i < arr.length - 1; i++) {
            s = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[s] > arr[j]) {
                    s = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 6, 8 };
       
        System.out.print("Unsorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        selectionSort(arr);

        System.out.print("\nSorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
