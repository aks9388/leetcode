class Solution {
    public int[] sortedSquares(int[] A) {
        int result[] = new int[A.length];
        int low=0, high=A.length-1;
        for(int i=A.length-1;i>=0;i--){
            if(Math.abs(A[low])<Math.abs(A[high])){
                result[i] = A[high]*A[high];
                high--;
            }
            else{
                result[i] = A[low]*A[low];
                low++;
            }
        }
        return result;
    }
}