# Write a Python program to implement Breadth-First Search (BFS) traversal of a graph.

from collections import deque
def bfs(graph, start):
    visited = set()
    queue = deque([start])
    
    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            print(vertex, end=' ')
            visited.add(vertex)
            queue.extend(neighbor for neighbor in graph[vertex] if neighbor not in visited)
            
            
# Example usage:
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

print("Breadth-First Search starting from vertex 'A':")
bfs(graph, 'A')

# Output:
# Breadth-First Search starting from vertex 'A':
# A B C D E F 
