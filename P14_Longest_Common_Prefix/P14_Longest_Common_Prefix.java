class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs[0].length();i++){
            char temp = strs[0].charAt(i);
            int j=0;
            for(; j<strs.length;j++){
               if(i<strs[j].length() && temp == strs[j].charAt(i)){
                   continue;
               } 
               else{
                   break;
               }
            }
            if(j!=strs.length){
                break;
            }
            else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}