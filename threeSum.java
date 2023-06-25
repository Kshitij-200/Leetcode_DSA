package two_pointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){

                int lo = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (lo < high){
                    if (nums[lo] + nums[high] == sum){

                        res.add(Arrays.asList(nums[i],nums[lo],nums[high]));

                        while (lo < high && nums[lo] == nums[lo + 1]){
                            lo++;
                        }
                        while (lo < high && nums[high] == nums[high - 1]){
                            high--;
                        }

                        lo++;
                        high--;
                    } else if (nums[lo] + nums[high] < sum) {
                        lo++;
                    }
                    else {
                        high--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
