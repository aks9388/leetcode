
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1; j<arr.length-1;j++){
                int diffa = Math.abs(arr[i]-arr[j]); 
                if(diffa<=a){
                    for(int k=j+1; k<arr.length; k++){
                    int diffb = Math.abs(arr[j]-arr[k]);
                    int diffc = Math.abs(arr[i]-arr[k]);
                    if(diffb<=b && diffc<=c){
                        count++;
                    }
                }
                }
                
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []arr = {1,1,2,2,3};
        int result = sol.countGoodTriplets(arr,0, 0, 1);
        System.out.println(result);
    }
}