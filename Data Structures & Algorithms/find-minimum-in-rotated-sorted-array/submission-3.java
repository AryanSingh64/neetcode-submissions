class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        for(int i=0 ; i<=nums.length-1;i++){

                ans = Math.min(ans, nums[i]);
        
        }
        return ans;
    }
}
