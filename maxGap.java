package Arrays;

import java.util.Arrays;

public class maxGap {
    public static int maximumGap(int[] nums) {
        int max = 0;
        Arrays.sort(nums);

        if(nums.length == 1){
            return 0;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] - nums[i] > max){
                    max = nums[j] - nums[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,9,1};
        System.out.println(maximumGap(arr));
    }
}
