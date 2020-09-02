import java.util.HashMap;

class Solution {
    public int balancedStringSplit(String s) {
        
        int countOfL = 0;
        int countOfR = 0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='R'){
                countOfR++;
            }
            else{
                countOfL++;
            }
            if(countOfL==countOfR){
                count++;
                countOfL = 0;
                countOfR = 0;
            }
        }
        return count;
    }	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.balancedStringSplit("LRLLLLRRRRRL");
        System.out.println(result);
    }
}