package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int [] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void insertion_Sort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    swap(arr,j,j - 1);
                }
                else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,8,4,1,0,69,2,3};
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
