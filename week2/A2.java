class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        //not a sliding window problem because the window size is not determined by any condition 
        //actually a divide and conquer problem : kadane algo 
        
        return max;
    }
}
