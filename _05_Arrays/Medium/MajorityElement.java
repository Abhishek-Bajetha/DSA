package _05_Arrays.Medium;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int el = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                el = nums[i];
            }
            if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                count++;
            }
            if (count > nums.length / 2) {
                return el;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }
}
