class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }

        if(mat.length%2 !=0){
            sum -= mat[mat.length/2][mat.length/2];
        }

        return sum;
    }
    public int diagonalSum1(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j || i+j==mat.length-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int result = sol.diagonalSum(arr);
        System.out.println(result);
    }
}