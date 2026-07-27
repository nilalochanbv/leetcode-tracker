// Last updated: 7/27/2026, 4:23:02 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> res = new ArrayList<>();
4        boolean[] seen = new boolean[strs.length];
5        for(int i=0;i<strs.length;i++){
6            if(seen[i]){
7                continue;
8            }
9            List<String> join = new ArrayList<>();
10            join.add(strs[i]);
11            seen[i]=true;
12
13            for(int j=i+1;j<strs.length;j++){
14                if(seen[j]){
15                    continue;
16                }
17                if(strs[i].length()==strs[j].length()){
18                    char[] sam = strs[i].toCharArray();
19                    char[] nila = strs[j].toCharArray();
20                    Arrays.sort(sam);
21                    Arrays.sort(nila);
22
23                    if(Arrays.equals(sam,nila)){
24                        join.add(strs[j]);
25                        seen[j]=true;
26                    }
27                }
28            }
29            res.add(join);
30        }
31        return res;
32    }
33}