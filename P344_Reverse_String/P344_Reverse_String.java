import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while(low<high){
            char temp = s[low];
            s[low++] = s[high];
            s[high--] = temp;
        }
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        char []s = {'H','e','l','l','o','!'};
        sol.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}