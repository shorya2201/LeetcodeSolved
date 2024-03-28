class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        Map<Integer , Integer> count  = new HashMap<>();
        
        for(int left = 0 , right = 0 ;right<nums.length; right++){
        count.merge(nums[right] , 1 , Integer::sum);
            while(count.get(nums[right]) == k+1)
                count.merge(nums[left++] , -1 , Integer::sum);
            
                ans = Math.max(ans , right-left+1);
            
            
        }
        return ans;
        
    }
}
