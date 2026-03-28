# To implement Prim’s Algorithm in Python to find the Minimum Spanning Tree (MST)
# of a weighted graph and analyze its efficiency using a greedy approach.

import heapq
def prim_mst(graph):
    mst_edges = []
    total_weight = 0
    visited = set()
    min_heap = [(0, next(iter(graph)))]  # Start with an arbitrary vertex
    
    while min_heap:
        weight, vertex = heapq.heappop(min_heap)
        if vertex not in visited:
            visited.add(vertex)
            total_weight += weight
            if weight != 0:  # Skip the starting vertex
                mst_edges.append((weight, vertex))
            
            for neighbor, edge_weight in graph[vertex].items():
                if neighbor not in visited:
                    heapq.heappush(min_heap, (edge_weight, neighbor))
    
    return mst_edges, total_weight

# Example usage:
graph = {
    'A': {'B': 1, 'C': 4},
    'B': {'A': 1, 'C': 2, 'D': 5},
    'C': {'A': 4, 'B': 2, 'D': 1},
    'D': {'B': 5, 'C': 1}
}
mst, total_weight = prim_mst(graph)
print("Edges in the Minimum Spanning Tree (weight, vertex):")
for edge in mst:
    print(edge)
print(f"Total weight of the Minimum Spanning Tree: {total_weight}")

# Output:
# Edges in the Minimum Spanning Tree (weight, vertex):
# (1, 'B')
# (2, 'C')
# (1, 'D')
# Total weight of the Minimum Spanning Tree: 4


# Output:
# Edges in the Minimum Spanning Tree (weight, vertex):
# (1, 'B')
# (2, 'C')
# (1, 'D')
# Total weight of the Minimum Spanning Tree: 4
