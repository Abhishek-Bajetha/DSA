package _05_Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElementII(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && el2 != arr[i]) {
                el1 = arr[i];
                count1++;
                System.out.println(el1);
            } else if (count2 == 0 && el1 != arr[i]) {
                el2 = arr[i];
                count2++;
                System.out.println(el2);
            } else if (el1 == arr[i]) {
                count1++;
                System.out.println(count1);
            } else if (el2 == arr[i]) {
                count2++;
                System.out.println(count2);
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        System.out.println(el1 + " " + el2);
        for (int i = 0; i < arr.length; i++) {
            if (el1 == arr[i]) {
                count1++;
            } else if (el2 == arr[i]) {
                count2++;
            }
        }
        System.out.println(el1 + " " + el2);
        if (count1 > (arr.length / 3))
            list.add(el1);
        if (count2 > (arr.length / 3))
            list.add(el2);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        List<Integer> list = majorityElementII(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
