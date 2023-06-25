package Recursion;

public class rotatedBinarySearch {
    static int roatedbs_recursion(int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int m = start + (end - start) / 2;
        if (arr[m] == target){
            return m;
        }

        if (arr[start] <= arr[m]){
            if (target >= arr[start] && target <= arr[m]){
                return roatedbs_recursion(arr,target,start,end - 1);
            }
            else {
                return roatedbs_recursion(arr,target,m + 1, end);
            }
        }

        if (target >= arr[m] && target <= arr[end]){
            return roatedbs_recursion(arr,target,m+1,end);
        }
        return roatedbs_recursion(arr,target,start,m - 1);

    }
    public static void main(String[] args) {
        int [] arr = {5 ,6 , 7, 8, 9, 1 , 2,3};
        System.out.println(roatedbs_recursion(arr,8,0,arr.length - 1));
    }
}
