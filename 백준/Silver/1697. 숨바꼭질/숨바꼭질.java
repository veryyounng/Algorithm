import java.util.*;

public class Main {
    static int[] distance = new int[100001]; // 각 위치까지의 최단 거리를 저장할 배열
    static boolean[] visited = new boolean[100001]; // 방문 여부를 저장할 배열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 수빈이의 위치
        int K = scanner.nextInt(); // 동생의 위치

        System.out.println(bfs(N, K)); // BFS를 통해 수빈이가 동생을 찾는 가장 빠른 시간 출력
    }

    static int bfs(int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start); // 시작 위치를 큐에 삽입
        visited[start] = true; // 시작 위치 방문 처리
        distance[start] = 0; // 시작 위치까지의 거리는 0

        while (!queue.isEmpty()) {
            int current = queue.poll(); // 현재 위치
            if (current == target) break; // 동생을 찾은 경우 종료

            // 현재 위치에서 이동할 수 있는 모든 경우를 고려하여 탐색
            int[] nextPositions = {current - 1, current + 1, current * 2};
            for (int next : nextPositions) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    queue.offer(next); // 다음 위치를 큐에 삽입
                    visited[next] = true; // 다음 위치 방문 처리
                    distance[next] = distance[current] + 1; // 다음 위치까지의 거리 계산
                }
            }
        }

        return distance[target]; // 동생의 위치까지의 최단 거리 반환
    }
}
