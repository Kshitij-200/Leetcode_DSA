package Arrays;

import java.util.Arrays;

public class squares_array {
    public static int[] sortedSquares(int[] nums) {
        int k = 0;
        int [] mix = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            mix[k] = nums[i]*nums[i];
            k++;
        }

        return mix;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,4};
        int [] arr2 = sortedSquares(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
