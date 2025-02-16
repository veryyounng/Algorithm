def solution(n, computers):
    global answer
    answer = 0
    visited = [0] * n
    
    def DFS(a):
        global answer
        for i in range(n):
            if not visited[i]:
                if computers[a][i] == 1:
                    
                    visited[i] = 1
                    DFS(i)
    
    for a in range(n):
        if not visited[a]:
            DFS(a)
            answer+=1
            
                    
                 
    return answer