void dfs(int[][] grid, int i, int j, boolean[][] visited) {
    if (i < 0 || j < 0 || i >= grid.length || 
        j >= grid[0].length || visited[i][j]) return;
    visited[i][j] = true;
    dfs(grid, i + 1, j, visited);
    dfs(grid, i - 1, j, visited);
    dfs(grid, i, j + 1, visited);
    dfs(grid, i, j - 1, visited);
}