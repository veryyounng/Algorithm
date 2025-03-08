def solution(tickets):
    answer = []
    visited = [0] * len(tickets)
    
    def DFS(now, path):
        if len(path) == len(tickets)+1:
            answer.append(path)
            return
        
        for idx, ticket in enumerate(tickets):
            if ticket[0] == now and visited[idx] == 0:
                visited[idx] = 1
                DFS(ticket[1], path+[ticket[1]])
                visited[idx] = 0
    DFS("ICN", ["ICN"])
    answer.sort()
    return answer[0]
