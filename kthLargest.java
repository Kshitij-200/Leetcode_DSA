package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class kthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            unique.add(nums[i]);
        }
        int size = unique.size();
        int [] ans = new int [size];
        int i=0;

        // iterating over the hashset
        for(int ele:unique){
            ans[i++] = ele;
        }

        Arrays.sort(ans);
        return ans[k - 1];
    }
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}
