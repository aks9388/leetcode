class Solution {
    public int numTeams(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    for(int k=j+1; k<arr.length;k++){
                        if(arr[j]<arr[k]){
                            count++;
                        }
                    }
                }
                else if(arr[i]>arr[j]){
                    for(int k=j+1; k<arr.length;k++){
                        if(arr[j]>arr[k]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}