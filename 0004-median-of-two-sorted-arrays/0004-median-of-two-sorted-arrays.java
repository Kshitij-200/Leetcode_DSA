class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
                k++;
            }else{
                mix[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        double median1 = 0;
        if(mix.length % 2 == 0){
            int index1 = (mix.length - 1) / 2;
            int index2 = mix.length / 2;
            double median = (double)(mix[index1] + mix[index2]) / 2;
            median1 = median;
        }

        else {
            int index = (mix.length - 1) / 2;
            double median = mix[index];
            median1 = median;
        }

        return median1;
    }
    
}