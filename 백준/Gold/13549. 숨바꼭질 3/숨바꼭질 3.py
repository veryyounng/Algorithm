from collections import deque

n, k = map(int, input().split())

MAX = 200000  # K<=100000이지만 2*x 때문에 여유 범위
dist = [10**9] * (MAX + 1)  # 각 위치까지의 최소 시간
dist[n] = 0

queue = deque([n])

def BFS():
    while queue:
        x = queue.popleft()
        if x == k:
            return dist[x]

        # 0초 이동: 2*x -> 같은 시간대이므로 앞에
        nx = 2 * x
        if 0 <= nx <= MAX and dist[nx] > dist[x]:
            dist[nx] = dist[x]
            queue.appendleft(nx)

        # 1초 이동: x-1, x+1 -> 다음 시간대이므로 뒤에
        for nxt in (x - 1, x + 1):
            if 0 <= nxt <= MAX and dist[nxt] > dist[x] + 1:
                dist[nxt] = dist[x] + 1
                queue.append(nxt)

    return -1  # 도달 불가 케이스는 사실상 없음

print(BFS())
