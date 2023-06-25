package Recursion;

public class SortedArray {
    static boolean isSorted(int [] arr, int index){
        if (index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int [] arr = {2, 5 , 8, 9, 100 , 41};
        System.out.println(isSorted(arr,0));
    }
}
