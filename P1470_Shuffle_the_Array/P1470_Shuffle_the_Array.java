import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int new_num[] = new int[2*n];
        for(int i=0, j=0; i <2*n; i=i+2, j++){
            new_num[i] = nums[j];
            new_num[i+1] = nums[n + j];
        }
        return new_num;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {1,2,3,4,5,6};
        nums = sol.shuffle(nums, nums.length/2);
        System.out.println(Arrays.toString(nums));
    }
}