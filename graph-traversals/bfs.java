void bfs(Map<Integer, List<Integer>> graph, int node) {
    Deque<Integer> q = new ArrayDeque<>();
    Set<Integer> visited = new HashSet<>();
    q.addLast(node);
    visited.add(node);

    while (q.isEmpty() == false) {
        int cur = q.removeFirst();
        System.out.print(cur + " ");
        for (int next : graph.get(cur)) {
            if (visited.contains(next)) continue;
            q.addLast(next);
            visited.add(next);
        }
    }
}