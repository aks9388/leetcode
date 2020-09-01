import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp=new ArrayList<>();
        int size=nums.length;
        for(int i=0;i<size;i++)
        {
            temp.add(index[i],nums[i]);
        }
        int[] res=new int[size];
        for(int i=0;i<temp.size();i++)
        {
            res[i]=temp.get(i);
        }
        return res;
    }
	
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []nums = {0,1,2,3,4};
        int []index = {0, 1, 2, 3, 0};
        int [] result = sol.createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
}