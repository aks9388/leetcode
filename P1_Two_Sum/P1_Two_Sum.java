import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                int index = map.get(target - nums[i]);
                return new int[]{index, i};
            }
        }
        return new int[]{-1, -1};
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {2,7,11,15};
        int []result = sol.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}