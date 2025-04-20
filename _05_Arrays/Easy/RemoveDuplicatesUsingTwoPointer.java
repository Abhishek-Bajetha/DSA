package _05_Arrays.Easy;

public class RemoveDuplicatesUsingTwoPointer {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 1, 2, 2, 2, 4, 5, 6 };
        int size = removeDuplicates(nums);
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
