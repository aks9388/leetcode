class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1;
        StringBuilder sb = new StringBuilder();
        int c =0;
        while(i>=0 && j>=0){
            int sum = c+(int)a.charAt(i)-(int)'0'+b.charAt(j)-(int)'0';
            sb.append(Integer.toString(sum%2));
            c=sum/2;
            i--;
            j--;
        }
        while(i>=0){
            int sum = c+(int)a.charAt(i)-(int)'0';
            sb.append(Integer.toString(sum%2));
            c=sum/2;
            i--;
        }
        while(j>=0){
            int sum = c+b.charAt(j)-(int)'0';
            sb.append(Integer.toString(sum%2));
            c=sum/2;
            j--;
        }
        if(c!=0){
            sb.append(Integer.toString(c));
        }
        return sb.reverse().toString();
    }
}