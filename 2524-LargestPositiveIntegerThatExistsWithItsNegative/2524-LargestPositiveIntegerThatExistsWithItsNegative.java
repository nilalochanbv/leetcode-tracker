// Last updated: 7/9/2026, 9:46:32 AM
class Solution {
    public int findMaxK(int[] arr) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]== -(arr[j])){
                    if(arr[i]>max){
                        max=arr[i];
                    }
                    }
                }
            }
            
        }
        return max;
    }
}
