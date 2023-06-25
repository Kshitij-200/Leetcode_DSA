package sorting;

public class setMismatch {
    public static int [] findErrors(int [] nums){
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
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int [] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void cyclic_Sort(int [] nums){
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
    }
    public static void main(String[] args) {

    }
}
