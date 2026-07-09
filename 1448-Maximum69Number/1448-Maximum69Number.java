// Last updated: 7/9/2026, 9:47:08 AM
class Solution {
    public int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
        
    }
}