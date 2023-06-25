package sorting;

import java.util.*;

public class findAllMissingno {
    public static List<Integer> findMissingnos(int [] nums){
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
            if (nums[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int [] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void cyclic_Sort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {

    }
}
