# Last updated: 7/9/2026, 9:45:41 AM

class Solution:
    def shortestPath(self, num_nodes: int, edges: list[list[int]], labels: str, max_same_label_streak: int) -> int:
        graph = defaultdict(list)
        for source, destination, weight in edges:
            graph[source].append((destination, weight))

        shortest_distance = {}

        starting_label = labels[0]
        priority_queue = [(0, 0, starting_label, 1)]
        shortest_distance[(0, starting_label, 1)] = 0

        while priority_queue:
            current_distance, current_node, current_label, streak_length = heapq.heappop(priority_queue)

            if current_node == num_nodes - 1:
                return current_distance

            if current_distance > shortest_distance.get((current_node, current_label, streak_length), float('inf')):
                continue

            for neighbor, edge_weight in graph[current_node]:
                neighbor_label = labels[neighbor]
                neighbor_streak_length = streak_length + 1 if neighbor_label == current_label else 1

                if neighbor_streak_length <= max_same_label_streak:
                    neighbor_state = (neighbor, neighbor_label, neighbor_streak_length)
                    candidate_distance = current_distance + edge_weight

                    if candidate_distance < shortest_distance.get(neighbor_state, float('inf')):
                        shortest_distance[neighbor_state] = candidate_distance
                        heapq.heappush(priority_queue, (candidate_distance, neighbor, neighbor_label, neighbor_streak_length))

        return -1