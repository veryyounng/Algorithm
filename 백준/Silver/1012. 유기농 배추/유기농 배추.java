import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int M = sc.nextInt(); // 배추밭의 가로길이
            int N = sc.nextInt(); // 배추밭의 세로길이
            int K = sc.nextInt(); // 배추의 개수

            int[][] field = new int[M][N]; // 배추밭 초기화

            for (int i = 0; i < K; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                field[X][Y] = 1; // 배추 위치 표시
            }

            boolean[][] visited = new boolean[M][N]; // 방문 여부 초기화
            int worms = 0; // 필요한 배추흰지렁이 수 초기화

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(field, visited, i, j);
                        worms++;
                    }
                }
            }

            System.out.println(worms);
        }

        sc.close();
    }

    private static void dfs(int[][] field, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isValid(nx, ny, field.length, field[0].length) && field[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(field, visited, nx, ny);
            }
        }
    }

    private static boolean isValid(int x, int y, int maxX, int maxY) {
        return x >= 0 && x < maxX && y >= 0 && y < maxY;
    }
}
