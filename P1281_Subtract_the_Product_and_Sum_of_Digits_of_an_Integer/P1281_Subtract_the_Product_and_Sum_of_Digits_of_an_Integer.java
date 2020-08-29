import java.util.HashMap;

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, product=1;
        while(n!=0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.subtractProductAndSum(1234);
        System.out.println(result);
    }
}