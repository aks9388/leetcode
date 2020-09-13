class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rightBoundary = grid[0].length-1;
        for(int i=0;i<grid.length;i++){
            int low = 0;
            int negIndex = -1;
            int high = rightBoundary;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(grid[i][mid]<0){
                    negIndex = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            if(negIndex>=0){
                int width = rightBoundary + 1 - negIndex;
                int height = grid.length - i;
                count += width*height;
                rightBoundary = negIndex -1;
            }
             
        }
        return count;
        
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int [][]nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int result = sol.countNegatives(nums);
        System.out.println(result);
    }
}