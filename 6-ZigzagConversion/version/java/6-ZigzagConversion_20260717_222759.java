// Last updated: 7/17/2026, 10:27:59 PM
1class Solution {
2    public String convert(String s, int num) {
3        if(num==1 || num>=s.length()){
4            return s;
5        }
6        StringBuilder[] arr = new StringBuilder[num];
7        for(int i=0;i<num;i++){
8            arr[i] = new StringBuilder();
9        }
10        int row=0;
11        boolean down=true;
12        for(int i=0;i<s.length();i++){
13            arr[row].append(s.charAt(i));
14            if(row==0) down = true;
15            else if(row==num-1) down=false;
16
17            if(down) row++;
18            else row--;
19        }
20        StringBuilder sb = new StringBuilder();
21        for(int i=0;i<num;i++){
22            sb.append(arr[i]);
23        }
24        return sb.toString();
25    }
26}