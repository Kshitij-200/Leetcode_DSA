class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>(); 
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int mini = (int)(n / 3) + 1;
        
        

        for(int i = 0; i < n; i++){
            int value = mp.getOrDefault(nums[i],0);
            mp.put(nums[i],value + 1);

            if(mp.get(nums[i]) == mini){
                ans.add(nums[i]);
            }

            if(ans.size() == 2){
                break;
            }
        }
        return ans;
    }
}