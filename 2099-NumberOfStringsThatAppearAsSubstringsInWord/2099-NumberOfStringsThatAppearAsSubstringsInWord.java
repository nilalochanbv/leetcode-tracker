// Last updated: 7/9/2026, 9:46:53 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String n : patterns){
            if(word.contains(n)){
                c++;
            }
        }
        return c;
    }
}