import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al =  new ArrayList<Integer>();
        for(int i=left ; i<=right; i++){
            if(isSelfDividing(i)){
                al.add(i);
            }
        }
        return al;
    }
    private boolean isSelfDividing(int num){
        if(num%10 == 0 ){
            return false;
        }
        if(num>=1 && num<=9){
            return true;
        }
        int temp = num;
        while(num>0){
            int digit = num%10;
            if(digit==0){
                return false;
            }
            if(temp % digit != 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> result = sol.selfDividingNumbers(1,23);
        System.out.println(Arrays.toString(result.toArray()));
    }
}