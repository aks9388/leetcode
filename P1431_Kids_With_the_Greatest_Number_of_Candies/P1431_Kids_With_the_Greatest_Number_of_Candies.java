import java.util.Arrays;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length;i++){
            if( candies[i]+extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
        
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []candies = {1,2,3,4,5,6};
        List<Boolean> result = sol.kidsWithCandies(candies, 4);
    }
}