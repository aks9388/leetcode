import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count=0;
        
        for(String str: words){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                sb.append(morse[str.charAt(i)-'a']);
            }
            if(!set.contains(sb.toString())){
                set.add(sb.toString());
                count++;
            }
        }
        return count;
        
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        String []arr = {"gin", "zen", "gig", "msg"};
        int result = sol.uniqueMorseRepresentations(arr);
        System.out.println(result);
    }
}