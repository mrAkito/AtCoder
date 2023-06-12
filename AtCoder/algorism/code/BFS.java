import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 3, 4, 5));
        graph.put(3, Arrays.asList(1, 2, 5));
        graph.put(4, Arrays.asList(2, 5));
        graph.put(5, Arrays.asList(2, 3, 4));

        bfs(graph, 1);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            visited.add(current);
            System.out.println(current);

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }
    }
}