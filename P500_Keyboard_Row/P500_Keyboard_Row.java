import java.util.Arrays;
import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String keyboard[] = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int j=0;
            int index = -1, k=0;
            while(index<0){
                index = keyboard[k].indexOf(words[i].charAt(0));
                k++;
            }
            while(j<words[i].length()){
                int tempIndex = keyboard[k-1].indexOf(words[i].charAt(j));
                if(tempIndex<0){
                    break;
                }
                j++;
            }
            if(j==words[i].length())
                result.add(words[i]);
        }
        String str[] = new String[result.size()];
        for(int j =0;j<result.size();j++){
		  str[j] = result.get(j);
		}
        return str;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        String str[] = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = sol.findWords(str);
        System.out.println(Arrays.toString(result));
    }
}