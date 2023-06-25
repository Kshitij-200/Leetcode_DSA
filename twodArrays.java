package search;

import java.util.Arrays;

public class twodArrays {

    static int[] search_2d(int [] [] arr, int target){

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int []{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] [] arr = {{78, 54, 65, 21},
                {7, 5, 2, 3},
                {85,44,65,8},
                {88,99,100},
                {70,50,6,0,7}
        };
        int target = 99;
        int [] ans = search_2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
