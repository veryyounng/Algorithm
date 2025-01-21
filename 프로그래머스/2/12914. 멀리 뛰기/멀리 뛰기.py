def solution(n):
    # n칸을 뛰는 방법을 저장할 배열 선언
    dp = [0] * (n + 1)
    # 초기 값 설정
    dp[0] = 1  # 0칸일 때 경우의 수
    dp[1] = 1  # 1칸일 때 경우의 수
    
    # 점화식을 이용해 DP 배열 계산
    for i in range(2, n + 1):
        dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
    
    # 정답 반환
    return dp[n]
