class Solution {
    public boolean isPowerOfThree(int n) {
        boolean result  = true;
        if(n==0 || n<0)
            return false;
        while(n>0){
            
            if(n%3==0 || n==1){
                n = n/3;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}