from collections import deque

n = int(input())
k = int(input())

board = [[0] * n for _ in range(n)]

for _ in range(k):
    r, c = map(int, input().split())
    board[r-1][c-1] = 1

turns = {}
l = int(input())
for _ in range(l):
    x, c = input().split()
    turns[int(x)] = c

dx = [0,1,0,-1]
dy = [1,0,-1,0]
idx = 0

snake = deque()
snake.append((0,0))

board[0][0] = 2
time = 0

while True:
    time += 1
    hr, hc = snake[0]
    dr = dx[idx]
    dc = dy[idx]

    nr = hr + dr
    nc = hc + dc

    if not (0 <= nr < n and 0 <= nc < n):
        print(time)
        break

    if board[nr][nc] == 2:
        print(time)
        break

    #사과 발견
    apple = board[nr][nc] == 1

    #사과없이 전진
    if not apple:
        tr, tc = snake.pop()
        board[tr][tc] = 0

    #사과 먹기
    snake.appendleft((nr, nc))
    board[nr][nc] = 2

    #회전
    if time in turns:
        if turns[time] == 'D':
            idx = (idx+1) % 4
        else:
            idx = (idx + 3) % 4

