class Solution {
    public int removeDuplicates(int[] nums) {
        int rp = 1;
        int wp = 0;
        while(rp<nums.length){
            if(nums[wp]==nums[rp]){
                rp++;
            }
            else{
                wp++;
                nums[wp] = nums[rp];
                rp++;
            }
        }
        return wp+1;
    }
}