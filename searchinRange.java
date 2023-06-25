package search;

public class searchinRange {
    static int searchRange(int [] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,10,87,45,5,23};
        int ans = searchRange(arr,8,0,6);
        System.out.println(ans);
    }
}
