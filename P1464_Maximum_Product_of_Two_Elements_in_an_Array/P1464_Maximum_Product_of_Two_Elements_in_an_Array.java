class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=max){
                s_max = max;
                max = nums[i];
            }
            else if(nums[i]>=s_max ){
                s_max=nums[i];
            }
        }
        return (max-1)*(s_max-1);
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []arr = {1,5,4,5};
        int result = sol.maxProduct(arr);
        System.out.println(result);
    }
}