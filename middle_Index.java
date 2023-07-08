package Arrays;

public class middle_Index {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] prefix = new int [n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int [] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i];
        }

        int k = 0;
        int j = 0;

        while(k < n && j < n){
            if(prefix[k] != suffix[j]){
                k++;
                j++;
            }else{
                break;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
