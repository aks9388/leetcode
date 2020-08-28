import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        //count the frequency of each numnber and add it to freq array since 0<=nums[i]<=100
        //do incremental change in freq i.e add lower number overall frequency count to higher number
        //[1,1,2,3] => [0, 2, 1, 1, ....] => [0, 0, 2, 3, .......]
        //copy it back to nums

        int freq[] = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int count = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                int temp = freq[i];
                freq[i] = count;
                count += temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = freq[nums[i]];
        }
        
        return nums;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j] && i!=j){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {8,1,2,2,3};
        int []result = sol.smallerNumbersThanCurrent1(nums);
        System.out.println(Arrays.toString(result));
    }
}