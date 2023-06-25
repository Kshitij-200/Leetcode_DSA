package Recursion;

public class binarySerachRecursion {
    public static int binarySearch(int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int m = start + (end - start) / 2;

        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]){
           return binarySearch(arr,target, start, m - 1);
        }
        return binarySearch(arr,target,m + 1, end);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,554,555,688};
        int target = 554;
        System.out.println(binarySearch(arr,target,0,arr.length - 1));
    }
}
