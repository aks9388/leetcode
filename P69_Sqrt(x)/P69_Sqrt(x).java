class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0){
            return x;
        }
        int low = 1;
        int result = 1;
        int high = x;
        while(low <= high){
            int mid = low + (high-low)/2;
            long temp = (long)mid*mid;
            if(temp==x){
                return mid;
            }
            else if(temp<x){
                low = mid+1;
                result = mid;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    public int mySqrt1(int x) {
        long y = 1;
        while(y*y<=x){
            y++;
        }
        return (int)y-1;
    }
}