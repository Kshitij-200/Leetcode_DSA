package search;

public class mountainArray {
    public static int mountain_array(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {

    }
}
