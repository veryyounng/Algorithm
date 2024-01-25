class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m + 1][n + 1];

        // 물에 잠긴 지역을 -1로 표시
        for (int[] puddle : puddles) {
            dp[puddle[0]][puddle[1]] = -1;
        }

        dp[1][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 물에 잠긴 지역은 경로가 없음
                if (dp[i][j] == -1) {
                    continue;
                }

                // 위와 왼쪽에서 올 수 있는 경우의 수를 합산
                if (i - 1 > 0 && dp[i - 1][j] != -1) {
                    dp[i][j] += dp[i - 1][j] % 1000000007;
                }

                if (j - 1 > 0 && dp[i][j - 1] != -1) {
                    dp[i][j] += dp[i][j - 1] % 1000000007;
                }
            }
        }

        return dp[m][n] % 1000000007;
    }
}
