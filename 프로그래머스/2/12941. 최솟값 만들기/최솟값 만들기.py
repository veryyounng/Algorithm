def solution(A, B):
    # A는 오름차순 정렬
    A.sort()
    # B는 내림차순 정렬
    B.sort(reverse=True)
    
    # 각 인덱스의 값을 곱한 결과를 합산
    answer = sum(a * b for a, b in zip(A, B))
    
    return answer
