def solution(n):
    cnt = 0
    
    while n != 0:
        if n % 2 == 0:
            n = n / 2
        if n % 2 == 1:
            n = (n-1) / 2
            cnt += 1
        

    return cnt