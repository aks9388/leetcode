class Solution {
    public int removeElement(int[] nums, int val) {
        int rp = 0;
        int wp = 0;
        while(rp<nums.length){
            if(nums[rp]==val){
                rp++;
            }
            else{
                int temp = nums[rp];
                nums[rp] = nums[wp];
                nums[wp] = temp;
                rp++;
                wp++;
            }
        }
        return wp;
    }
}