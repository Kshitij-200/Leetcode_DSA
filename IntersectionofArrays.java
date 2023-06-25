package sorting;

import java.util.Arrays;

public class IntersectionofArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = nums1.length - 1;
        int j = nums2.length - 1;

        if(nums1.length == 0 || nums2.length == 0){
            return new int[]{-1,-1};
        }

        if (j >= 0){
            while (i >= 0){
                if (nums1[i] == nums2[j]){
                    i--;
                    j--;

                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] arr1 = {4,9,5};
        int [] arr2 = {9,4,9,8,4};
        int [] arr3 = intersection(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }
}
