class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i <nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {1,2,3,4,5};
        sol.runningSum(nums);
    }
}