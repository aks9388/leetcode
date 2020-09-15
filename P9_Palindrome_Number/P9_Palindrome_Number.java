class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int reverse = reverse(x);
        if(x==reverse){
            return true;
        }
        return false;
    }
    private int reverse(int x) {
        int reverse = 0;
        boolean isPositive = true;
        if(x<0){
            isPositive = false;
        }
        x = Math.abs(x);
        while(x>0){
            int digit = x%10;
            int temp = reverse*10 + digit;
            if(temp/10!=reverse){
                return 0;
            }
            reverse = temp;
            x = x/10;
        }
        if(!isPositive){
            return -1*reverse;
        }
        return reverse;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(121);
        System.out.println(result);
    }
}