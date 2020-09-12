import java.util.Arrays;

class Solution {
    public int maximum69Number (int num) {
        String numStr = Integer.toString(num);
        char []arr = numStr.toCharArray();
        int index = numStr.indexOf("6");
        if(index>-1){
            arr[index]= '9';
        }
        return Integer.parseInt(String.valueOf(arr));
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.maximum69Number(6969);
        System.out.println(result);
    }
}