class Solution {
    public int[] searchRange(int[] nums, int target) {
        int pehla = first(nums,target,0,nums.length - 1);
        int dosra = second(nums,target,0,nums.length - 1);

        return new int[]{pehla,dosra};
    }

    public int first (int [] nums, int target, int start, int end){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            if(nums[mid] == target){
                ans = mid;
            }
        }
        return ans;
    }

    public int second (int [] nums, int target, int start, int end){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            if(nums[mid] == target){
                ans = mid;
            }
        }
        return ans;
    }
}