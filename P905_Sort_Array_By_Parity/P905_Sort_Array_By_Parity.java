import java.util.Arrays;

import jdk.internal.jshell.tool.resources.l10n;

class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int r = 0;
        int w = arr.length-1;
        while(r<w){
            while(arr[r]%2==0 && r<arr.length){
                r++;
                break;
            }
            while(arr[w]%2==1 && w>=0){
                w--;
                break;
            }
            if(r<w){
                int temp = arr[r];
                arr[r] = arr[w];
                arr[w] = temp;
            }
            else{
                break;
            }
            
        }
        
        return arr;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []arr = {1,3,4,2};
        int []result = sol.sortArrayByParity(arr);
        System.out.println(Arrays.toString(result));
    }
}