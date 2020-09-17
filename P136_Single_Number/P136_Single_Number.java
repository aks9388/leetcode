class Solution {
    public int singleNumber(int[] nums) {
        int number = nums[0];
        for(int i=1;i<nums.length;i++){
            number = number^nums[i];
        }
        return number;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int nums[] = {2,2,1};
        int result = sol.singleNumber(nums);
        System.out.println(result);
    }
}