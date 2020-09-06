class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                sb.append((char)(97+str.charAt(i)-'A'));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.toLowerCase("Hello");
        System.out.println(result);
    }
}