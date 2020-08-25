import java.util.Arrays;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int numOfJewel = 0;
        for(int i=0; i<S.length();i++){
            for(int j=0; j<J.length(); j++){
                if(S.charAt(i)==J.charAt(j)){
                    numOfJewel++;
                }
            }
        }
        return numOfJewel;
    }

	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.numJewelsInStones("z","ZZ");
        System.out.println(result);
    }
}