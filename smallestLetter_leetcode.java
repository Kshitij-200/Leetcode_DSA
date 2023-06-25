package search;

public class smallestLetter_leetcode {
    public static int smallest_letter(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];
    }
    public static void main(String[] args) {

    }
}
