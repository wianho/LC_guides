def dfs(graph: Dict[int, List[int]], cur: int, visited: Set[int]):
    if cur in visited: return
    
    visited.add(cur)
    print(cur, end = " ");
    
    for next in graph[cur]:
        dfs(graph, next, visited)