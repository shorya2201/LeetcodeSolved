//Just as we did in missing number problem , same we did in this  , we have difined a xor as a insatance variable
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
       int xor = 0;
       for(int i = 0;i<nums.length;i++){
        xor = xor^nums[i];
       }
        return xor;
        
    }
}
