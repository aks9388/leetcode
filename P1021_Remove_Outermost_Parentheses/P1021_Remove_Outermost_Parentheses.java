class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(count>=1){
                    str.append(s.charAt(i));
                }
                count++;
                
            }
            else{
                if(count>1){
                    str.append(s.charAt(i));
                }
                count--;
            }
            
        }
        return str.toString();
        
    }
}