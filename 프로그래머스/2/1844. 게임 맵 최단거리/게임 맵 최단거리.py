from collections import deque

def solution(maps):
    N = len(maps)  # 행의 개수
    M = len(maps[0])  # 열의 개수

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    def BFS(x, y):
        queue = deque()
        queue.append((x, y))
        
        while queue:
            x, y = queue.popleft()
            
            # 만약 도착지에 도달하면 즉시 반환
            if x == N-1 and y == M-1:
                return maps[x][y]

            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                
                # 범위를 벗어나면 무시
                if nx < 0 or nx >= N or ny < 0 or ny >= M:
                    continue
                # 벽(0)이면 무시
                if maps[nx][ny] == 0:
                    continue
                # 방문하지 않은 길(1)이면 이동
                if maps[nx][ny] == 1:
                    maps[nx][ny] = maps[x][y] + 1  # 이동 거리 증가
                    queue.append((nx, ny))

        # 목적지에 도착할 수 없는 경우
        return -1

    return BFS(0, 0)
