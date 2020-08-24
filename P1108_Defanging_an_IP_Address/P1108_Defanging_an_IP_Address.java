import java.util.Arrays;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
    public String defangIPaddr1(String address) {
        StringBuilder sb =  new StringBuilder();
        for(int i=0; i< address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.defangIPaddr1("1.1.1.1");
        System.out.println(result);
    }
}