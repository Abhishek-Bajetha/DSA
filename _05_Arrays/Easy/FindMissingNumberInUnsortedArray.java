package _05_Arrays.Easy;

public class FindMissingNumberInUnsortedArray {
    public static int findMissingNumber(int arr[]) {
        int flag ,i;
        for ( i = 0; i < arr.length; i++) {
           flag = 1;
           for(int j = 0; j < arr.length; j++){
               if (arr[j] == i) {
                   flag = 0;
               }
           }
           if (flag == 1 ) return i;
       }
       return i;
    }

    public static void main(String[] args) {
        int arr[] = { 4,2,5,1,7,8,3,0};
        int missing = findMissingNumber(arr);
        System.out.println(missing);
    }
}


