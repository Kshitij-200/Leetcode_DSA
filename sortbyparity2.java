package sorting;

import java.util.Arrays;

public class sortbyparity2 {
    public static int[] sortArrayByParityII(int[] nums) {

        int [] even = new int[nums.length / 2];
        int [] odd = new int[nums.length / 2];
        int k = 0;
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                even[k] = nums[i];
                k++;
            }else{
                odd[t] = nums[i];
                t++;
            }
        }

        int o = 0;
        int u = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even[o];
                o++;
            }else{
                nums[i] = odd[u];
                u++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,5,7};
        int [] nums = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(nums));
    }
}
