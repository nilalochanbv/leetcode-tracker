// Last updated: 7/11/2026, 8:48:12 AM
1public class Solution {
2
3    public int countCompleteComponents(int n, int[][] edges) {
4        List<Integer>[] graph = new ArrayList[n];
5        Map<List<Integer>, Integer> componentFreq = new HashMap<>();
6        for (int vertex = 0; vertex < n; vertex++) {
7            graph[vertex] = new ArrayList<>();
8            graph[vertex].add(vertex);
9        }
10        for (int[] edge : edges) {
11            graph[edge[0]].add(edge[1]);
12            graph[edge[1]].add(edge[0]);
13        }
14        for (int vertex = 0; vertex < n; vertex++) {
15            List<Integer> neighbors = graph[vertex];
16            Collections.sort(neighbors);
17            componentFreq.put(
18                neighbors,
19                componentFreq.getOrDefault(neighbors, 0) + 1
20            );
21        }
22        int completeCount = 0;
23        for (Map.Entry<
24            List<Integer>,
25            Integer
26        > entry : componentFreq.entrySet()) {
27            if (entry.getKey().size() == entry.getValue()) {
28                completeCount++;
29            }
30        }
31
32        return completeCount;
33    }
34}