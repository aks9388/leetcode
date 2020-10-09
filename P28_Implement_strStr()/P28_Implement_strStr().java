class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0 && haystack.length()==0){
            return 0;
        }
        if(haystack.length()==0 && needle.length()>0){
            return -1;
        }
        int i = 0;
        for(;i<haystack.length();i++ ){
            int j=0;
            for(;j<needle.length();j++){
                if(i+j<haystack.length() && haystack.charAt(i+j)==needle.charAt(j)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}