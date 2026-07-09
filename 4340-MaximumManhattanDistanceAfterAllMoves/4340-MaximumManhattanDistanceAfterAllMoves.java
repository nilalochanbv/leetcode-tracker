// Last updated: 7/9/2026, 9:45:31 AM
class Solution {
    public int maxDistance(String moves) {
        int x =0;
        int y =0;
        int u =0;
        for(char move : moves.toCharArray()){
            if(move == 'U'){
                x++;
            }
            else if(move== 'D'){
                x--;
            }
            else if(move == 'L'){
                y--;
            }
            else if(move == 'R'){
                y++;
            }
            else{
                u++;
            }
        }
        return Math.abs(x)+Math.abs(y)+u;
    }
}