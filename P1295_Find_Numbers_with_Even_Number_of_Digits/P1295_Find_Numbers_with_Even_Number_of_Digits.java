class Solution {
    public int findNumbers(int[] nums) {
        int countOfEvenDigits = 0;
        for(int i=0; i<nums.length; i++){
            int numberOfDigits = 0;
            while(nums[i]>0){
                numberOfDigits++;
                nums[i] /= 10;
            }
            if(numberOfDigits % 2==0){
                countOfEvenDigits++;
            }
        }
        return countOfEvenDigits;
        
    }

    //since there is contraint on range of nums[i] i.e. 0 <= nums[i] <= 10^5
    public int findNumbers1(int[] nums) {
        int countOfEvenDigits = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=10 && nums[i]<=99 || nums[i]>=1000 && nums[i]<=9999 || nums[i]==100000){
                countOfEvenDigits++;
            }
        }
        return countOfEvenDigits;
        
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int nums[] = {12,345,2,6,7896};
        int result = sol.findNumbers(nums);
        System.out.println(result);
    }
}