class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(min>sum && sum<0){
                min = sum;
            }
        }
        if(min<0){
            return Math.abs(min)+1;
        }
        return 1;
        
    }
}