package Arrays;

import java.util.Arrays;

public class absolute_diff {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int k = 0;
        int [] ans = new int [n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + Math.abs(nums[i] - nums[j]);
            }
            ans[k++] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,5};
        int [] arr = getSumAbsoluteDifferences(nums);
        System.out.println(Arrays.toString(arr));
    }
}
