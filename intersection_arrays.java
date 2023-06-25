package sorting;

import java.util.*;



public class intersection_arrays {
    public static List<Integer> findDifference(int[] nums1, int[] nums2) {
        Set <Integer> arr1 = new HashSet<>();
        Set <Integer> arr2 = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            arr1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(!arr1.contains(nums2[i])){
                arr2.add(nums2[i]);
            }
        }
//        ans.add(arr2);
        return ans;

    }


    public static void main(String[] args) {
        int [] arr1 = {10,4,3,3,2};
        int [] arr2 = {10,4,3,2};

        System.out.println(findDifference(arr1,arr2));
    }
}
