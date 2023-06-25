package search;

public class firstandLast {
    public static int [] first_last(int [] arr, int target){

        int [] ans = {-1,-1};
        int first = searchRange(arr,target,true);
        int last = searchRange(arr,target,false);

        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    public static int searchRange(int [] arr, int target, boolean findFirstOccurence){

        int ans = -1;
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
                ans = mid;
                if (findFirstOccurence){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
