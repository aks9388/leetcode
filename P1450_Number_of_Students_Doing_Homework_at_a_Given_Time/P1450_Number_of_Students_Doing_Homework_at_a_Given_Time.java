class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int numberOfStudent = 0;
        for(int i=0; i<startTime.length; i++){
            if(queryTime >= startTime[i] && queryTime<=endTime[i]){
                numberOfStudent++;
            }
        }
        return numberOfStudent;
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int []startTime = {1,2,3};
        int []endTime = {3,2,7};
        int result = sol.busyStudent(startTime, endTime, 4);
        System.out.println(result);
    }
}