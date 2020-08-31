import java.util.HashMap;

class Solution {
    public int xorOperation(int n, int start) {
        int result = start;
        for(int i=1; i<n;i++){
            result = result ^(start + (2*i));
        }
        return result;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.xorOperation(4,3);
        System.out.println(result);
    }
}