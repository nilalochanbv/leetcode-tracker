// Last updated: 7/9/2026, 9:48:01 AM
class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        string doubled= s+s;
        return doubled.contains(goal);
        
    }
};