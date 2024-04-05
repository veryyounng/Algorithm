import java.util.Scanner;

public class Main {
    static int[][] map;
    static boolean[] visited;
    static int N;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);

        System.out.println(min);
    }

    static void dfs(int start, int depth) {
        if (depth == N / 2) {
            calculateDifference();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static void calculateDifference() {
        int startTeam = 0;
        int linkTeam = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startTeam += map[i][j];
                    startTeam += map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    linkTeam += map[i][j];
                    linkTeam += map[j][i];
                }
            }
        }

        int diff = Math.abs(startTeam - linkTeam);
        if (diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }
        min = Math.min(min, diff);
    }
}
