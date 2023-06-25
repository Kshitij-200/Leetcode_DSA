package sorting;

import java.util.Arrays;

public class bubbleSort {
    static void bubble_Sort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,8,4,1,0,69,2,3};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
