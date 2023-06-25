package two_pointers;

public class median_Array {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mix[k] = arr1[i];
                i++;
                k++;
            }else{
                mix[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            mix[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            mix[k] = arr2[j];
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
            int index = (mix.length + 1) / 2;
            double median = mix[index];
            median1 = median;
        }

        return median1;
    }
    public static void main(String[] args) {
        int arr1 [] = {1,2};
        int [] arr2 = {3,4};
        double median2 = findMedianSortedArrays(arr1,arr2);
        System.out.println(median2);
    }
}
