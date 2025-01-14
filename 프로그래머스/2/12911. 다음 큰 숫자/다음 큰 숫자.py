def solution(n):
    tmp = n+1
    while(True):
        
        if bin(tmp).count('1') == bin(n).count('1'):
            return tmp
        tmp += 1
    