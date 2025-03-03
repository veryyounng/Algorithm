def solution(tickets):
    from collections import defaultdict

    graph = defaultdict(list)
    
    # 티켓을 도착지를 기준으로 정렬하여 저장 (사전순으로 방문하기 위해)
    for src, dst in sorted(tickets):
        graph[src].append(dst)

    route = []

    def dfs(airport):
        while graph[airport]:
            dfs(graph[airport].pop(0))  # 가장 앞의 도착지를 방문
        route.append(airport)

    dfs("ICN")  # 출발지 "ICN"에서 DFS 시작
    return route[::-1]  # 경로를 뒤집어서 반환
