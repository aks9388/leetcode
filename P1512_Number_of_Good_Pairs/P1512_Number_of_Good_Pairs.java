class Solution {
    //Time - O(n^2) Space-O(1)
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count; 
    }
    
    //Time - O(n) Space-O(n)
	public int numIdenticalPairs1(int[] nums) {
        int count = 0;
		int freq[] = new int[101];
		// for 1,1,1 it will add 1 for 1st one but 2 for second one and so on
        for(int i=0;i<nums.length;i++){
            count = count + freq[nums[i]]++;
        }
        return count; 
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {1,2,3,4,5,1,1,3};
        int result = sol.numIdenticalPairs1(nums);
        System.out.println(result);
    }
}