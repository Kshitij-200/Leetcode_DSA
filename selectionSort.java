package Recursion;

import java.util.Arrays;

public class selectionSort {
    static void Selection_Sort(int [] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                Selection_Sort(arr,r,c+1,c);
            }else {
                Selection_Sort(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            Selection_Sort(arr,r - 1,0,0);
        }
    }
    public static void main(String[] args) {
        int [] arr = {4, 3 , 2 , 1 ,5};
        Selection_Sort(arr, arr.length - 1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
