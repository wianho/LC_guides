void dfs(Map<Integer, List<Integer>> graph, int cur, Set<Integer> visited) {
    if (visited.contains(cur)) return;
    visited.add(cur);
    System.out.print(cur + " ");
    for (int next : graph.get(cur)) {
        dfs(graph, next, visited);
    }
}