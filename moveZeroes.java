package Arrays;

import java.util.Arrays;

public class moveZeroes {
    public static void move_Zeroes(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 1){
            System.out.println(nums[0]);
        }

        for(int i = 0; i < nums.length; i++){
            int last = nums.length - 1 - i;
            if(nums[i] == 0 && i <= last){
                swap(nums,i,last);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {0,0,3,12,5};
        move_Zeroes(arr);

    }
}
