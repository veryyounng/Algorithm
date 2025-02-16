def solution(numbers, target):
    global answer
    answer = 0
    
    def DFS(L, sum):
        global answer
        
        if L == len(numbers):
            if sum == target:
                answer += 1
                return
        else:
            DFS(L+1, sum+numbers[L])
            DFS(L+1, sum-numbers[L])
            
            
    DFS(0,0)
    return answer