from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 미리 수집
viruses = []
empties = []
for i in range(n):
    for j in range(m):
        if graph[i][j] == 2:
            viruses.append((i, j))
        elif graph[i][j] == 0:
            empties.append((i, j))

E = len(empties)   # 전체 빈칸 수
best = 0

def bfs():
    """현재 graph(임시로 세운 3개의 벽 포함) 상태에서 확산 후 안전영역 계산."""
    a = [row[:] for row in graph]  # deepcopy 대신 얕은 복사
    q = deque(viruses)             # 시작점 재탐색 불필요
    infected = 0

    global best
    while q:
        r, c = q.popleft()
        for k in range(4):
            nr, nc = r + dx[k], c + dy[k]
            if 0 <= nr < n and 0 <= nc < m and a[nr][nc] == 0:
                a[nr][nc] = 2
                infected += 1
                # 가지치기: 남을 수 있는 최대 안전칸이 best 이하면 더 볼 필요 없음
                if E - 3 - infected <= best:
                    return
                q.append((nr, nc))

    safe = E - 3 - infected
    if safe > best:
        best = safe

def make_wall(idx, built):
    """empties[idx:]에서 벽을 골라 총 3개 세우는 '조합' 탐색 (백트래킹)."""
    # 남은 칸으로 3개 못 채우면 가지치기
    if built + (E - idx) < 3:
        return
    if built == 3:
        bfs()
        return
    if idx == E:
        return

    r, c = empties[idx]

    # 1) 이 칸에 벽 세우기
    graph[r][c] = 1
    make_wall(idx + 1, built + 1)
    graph[r][c] = 0  # 복구

    # 2) 이 칸 건너뛰기
    make_wall(idx + 1, built)

make_wall(0, 0)
print(best)
