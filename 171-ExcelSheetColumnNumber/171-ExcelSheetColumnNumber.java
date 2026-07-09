// Last updated: 7/9/2026, 9:49:22 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            int curr=columnTitle.charAt(i) - 'A' +1;
            res=res*26+curr;
        }
        return res;
    }
}