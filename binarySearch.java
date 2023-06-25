package search;

public class binarySearch {

    static int order_agnostic(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                start = mid + 1;
            }
            else if (target > arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int binary_search(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,6,8,10,11,23,25,45,87};
        int [] arr1 = {85,84,80,14,2,1,0};
        int ans1 = order_agnostic(arr1,2);
        System.out.println(ans1);
//        int ans = binary_search(arr,11);
//        System.out.println(ans);
    }
}
