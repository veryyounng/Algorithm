import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] costs = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = sc.nextInt();
            }
        }

        int result = minCost(N, costs);
        System.out.println(result);

        sc.close();
    }

    private static int minCost(int n, int[][] costs) {
        int[][] dp = new int[n][3];

        // 초기값 설정
        for (int i = 0; i < 3; i++) {
            dp[0][i] = costs[0][i];
        }

        // 다이나믹 프로그래밍
        for (int i = 1; i < n; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        // 결과 반환
        return Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]);
    }
}
