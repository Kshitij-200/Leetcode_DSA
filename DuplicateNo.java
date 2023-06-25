package sorting;

public class DuplicateNo {
    public static int findDuplicate(int [] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i, correct);
            }
            else{
                i++;
            }
        }
        return nums[nums.length - 1];

    }
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

    }
}
