def bfs(graph: Dict[int, List[int]], node: int):
    q = deque([node])
    visited = set([node])

    while q:
        cur = q.popleft()
        
        print(cur, end = " ")
        
        for next in graph[cur]:
            if next in visited: 
                continue
                
            q.append(next)
            visited.add(next)