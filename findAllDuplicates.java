package sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {
    public static List<Integer> findDuplicates(int [] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (index != nums[index] - 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int [] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void cyclic_Sort(int [] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {

    }
}
