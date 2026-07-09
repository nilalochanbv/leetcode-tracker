// Last updated: 7/9/2026, 9:46:45 AM
class Solution {
    public int mostWordsFound(String[] sentence) {
        int max=0;
        for(String curr : sentence){
            int currLen = curr.split(" ").length;
            if(max < currLen) max = currLen; 
        }
        return max;
    }
}