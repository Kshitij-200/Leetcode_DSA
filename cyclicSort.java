package sorting;

import java.util.Arrays;

public class cyclicSort {
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
        int [] arr = {4,2,6,1,3,5,3};
        cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
