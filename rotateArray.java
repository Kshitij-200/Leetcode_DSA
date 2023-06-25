package Arrays;

import java.util.Arrays;

public class rotateArray {
    public static void rotate_array(int[] nums) {
        if (nums.length == 1) {
            System.out.println(nums[0]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            swap(nums, 0, i);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        rotate_array(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
