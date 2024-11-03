import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // 방향 벡터 (상, 하, 좌, 우)
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 방문 여부와 거리 기록
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        // 시작점 추가
        queue.offer(new int[] {0, 0, 1});  // {x 좌표, y 좌표, 이동 거리}
        visited[0][0] = true;
        
        // BFS 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            
            // 도착지에 도달했으면 거리 반환
            if (x == n - 1 && y == m - 1) {
                return dist;
            }
            
            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 맵을 벗어나지 않고, 벽이 아니며, 방문하지 않았을 경우
                if (nx >= 0 && ny >= 0 && nx < n && ny < m 
                    && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[] {nx, ny, dist + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        
        // 도착지에 도달할 수 없는 경우
        return -1;
    }
}
