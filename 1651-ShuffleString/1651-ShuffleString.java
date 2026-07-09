// Last updated: 7/9/2026, 9:47:05 AM
class Solution {
    public String restoreString(String s, int[] index) {
        int n = s.length();
        char [] str = new char[n];
        for(int i=0;i<n;i++){
            str[index[i]] = s.charAt(i);
        }
        String str2 = new String(str);
        return str2;
    }
}