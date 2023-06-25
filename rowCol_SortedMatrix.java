package search;

public class rowCol_SortedMatrix {
    static int [] searchSorted(int [][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1){
            return binarySearch(arr,0,0,cols - 1, target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;
        while (rstart < (rend - 1)){
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cmid] == target){
                return new int[]{mid, cmid};
            }
            if (arr[mid][cmid] < target){
                rstart = mid;
            }
            else {
                rend = mid;
            }

            // now we have 2 rows
            // check wheather the target is in the column of 2 rows
            if (arr[rstart][cmid] == target){
                return new int[]{rstart, cmid};
            }
            if (arr[rstart + 1][cmid] == target){
                return new int[]{rstart + 1, cmid};
            }
            // search in 1st half
            if (target <= arr[rstart][cmid - 1]){
                return binarySearch(arr,rstart,0,cmid - 1,target);
            }
            // search in 2nd half
            if (target >= arr[rstart][cmid + 1] && target <= arr[rstart][cols - 1]){
                return binarySearch(arr,rstart,cmid + 1, cols - 1,target);
            }
            // search in 3rd half
            if (target <= arr[rstart + 1][cmid - 1]){
                return  binarySearch(arr, rstart + 1, 0, cmid - 1, target);
            }
            // search in 4th half
            else {
                return binarySearch(arr,rstart + 1, cmid + 1, cols - 1, target);
            }


        }
        return new int[]{-1, -1};
    }

    static int [] binarySearch(int [][] arr, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if (arr[row][mid] == target){
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target){
                colStart = mid + 1;
            }
            else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

    }
}
