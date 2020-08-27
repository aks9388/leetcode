import java.util.HashMap;

class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i=0;i< indices.length;i++){
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< indices.length;i++){
            char temp = map.get(i);
            sb.append(temp);
        }
        return sb.toString();
    }
    
    public String restoreString1(String s, int[] indices) {
        char []sb = new char[indices.length];
        for(int i=0;i< indices.length;i++){
            sb[indices[i]] = s.charAt(i);
        }
       
        return String.valueOf(sb);
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []indices = {4,5,6,7,0,2,1,3};
        String result = sol.restoreString1("codeleet",indices);
        System.out.println(result);
    }
}