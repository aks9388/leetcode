class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int hammingDistance = 0;
        while(xor>0){
            if((xor&1)==1){
                hammingDistance++;
            }
            xor = xor>>1;
        }
        return hammingDistance;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.hammingDistance(2, 4);
        System.out.println(result);
    }
}