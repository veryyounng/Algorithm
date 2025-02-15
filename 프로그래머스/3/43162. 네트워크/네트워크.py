def solution(n, computers):
    answer = 0
    
    visited = [0] * n
    
    def DFS(i):
        visited[i] = 1
        
        for a in range(n):
            if not visited[a]:
                if computers[i][a]:
                    DFS(a)
                    
    for i in range(n):
        if not visited[i]:
            DFS(i)
            answer += 1
            
    return answer