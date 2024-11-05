class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n]; // 모든 컴퓨터의 방문 여부를 체크하는 배열
        int networkCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { // 방문하지 않은 컴퓨터라면
                dfs(i, computers, visited); // 해당 컴퓨터에서 DFS 시작
                networkCount++; // 새로운 네트워크 발견 시 카운트 증가
            }
        }

        return networkCount;
    }

    private void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true; // 현재 노드를 방문 처리

        for (int i = 0; i < computers.length; i++) {
            if (computers[node][i] == 1 && !visited[i]) { // 연결되어 있고, 아직 방문하지 않았다면
                dfs(i, computers, visited); // 재귀적으로 방문
            }
        }
    }
}
