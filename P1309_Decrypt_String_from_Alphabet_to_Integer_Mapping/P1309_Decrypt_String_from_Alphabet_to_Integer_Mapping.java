class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = s.length();
        while(i < n)
        {
            int j = i + 2;
            if(j < n && s.charAt(j) == '#')
            {
                int x = (s.charAt(i) - 48) * 10 + (s.charAt(i + 1) - 48);
                sb.append((char)(x + 96));
                i+=3;
            }
            else
            {
                sb.append((char)(s.charAt(i) + 48));
                i++;
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.freqAlphabets("10#11#12");
        System.out.println(result);
    }
}