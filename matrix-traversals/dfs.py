def dfs(grid: List[List[int]], i: int, j: int, visited: Set[List[int]]):
    if i < 0 or j < 0 or i >= len(grid) or \
    j >= len(grid[0]) or (i, j) in visited: return
    
    visited.add((i, j))
    dfs(grid, i + 1, j, visited)
    dfs(grid, i - 1, j, visited)
    dfs(grid, i, j + 1, visited)
    dfs(grid, i, j - 1, visited)