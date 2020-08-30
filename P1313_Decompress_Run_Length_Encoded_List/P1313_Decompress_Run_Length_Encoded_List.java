import java.util.HashMap;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0;i <nums.length;i=i+2){
            n += nums[i];
        }
        int[] result = new int[n];
        int index = 0;
        for(int i=0; i< nums.length; i=i+2){
            int freq = nums[i];
            int value = nums[i+1];
            while(freq>0){
                result[index++] = value;
                freq--;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {1,2,3,4};
        String result = sol.decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }
}