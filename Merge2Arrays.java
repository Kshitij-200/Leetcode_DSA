package sorting;

public class Merge2Arrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int start1 = 0;
        int end1 = nums1.length - 1;

        int start2 = 0;
        int end2 = nums2.length - 1;
        int x = 0;

        int [] merged = new int [m + n];
        while(start1 <= end1 && start2 <= end2){
            if(nums1[start1] < nums2[start2]){
                merged[x] = nums1[start1];
                start1++;

            }
            else{
                merged[x] = nums2[start2];
                start2++;

            }
            x++;
        }

        while(start1 <= end1){
            merged[x] = nums1[start1];
            start1++;
            x++;
        }

        while(start2 <= end2){
            merged[x] = nums2[start2];
            start2++;
            x++;
        }

    }
    public static void main(String[] args) {
        int arr1 [] = {2,3,4,5,6};
        int arr2 [] = {0,1,7,8};


    }
}
