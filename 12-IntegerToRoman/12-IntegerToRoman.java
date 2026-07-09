// Last updated: 7/9/2026, 9:50:37 AM
class Solution {
    public String intToRoman(int num) {
        int[] val ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sy={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<val.length;++i){
            if(num==0) break;
            while(num >= val[i]){
                sb.append(sy[i]);
                num-=val[i];
            }
        }
        return sb.toString();
    }
}