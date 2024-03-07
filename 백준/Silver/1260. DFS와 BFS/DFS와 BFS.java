import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int V = sc.nextInt(); // 시작 정점

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int vertex1 = sc.nextInt();
            int vertex2 = sc.nextInt();

            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
        System.out.println();

        sc.close();
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}
