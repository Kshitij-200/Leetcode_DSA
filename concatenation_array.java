package Arrays;

import java.util.Arrays;

public class concatenation_array {
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int [2 * nums.length];
        for(int i = 0; i < ans.length; i++){
            if(i < nums.length){
                ans[i] = nums[i];
            }
            else {
                ans[i] = nums[i - nums.length];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int arr2 [] = getConcatenation(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
