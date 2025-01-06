def solution(s):
    # 문자열을 공백으로 나눠 리스트로 변환
    tmp_arr = list(map(int, s.split(" ")))
    
    # 리스트 정렬
    tmp_arr.sort()
    
    # 최소값과 최대값을 문자열로 연결
    answer = f"{tmp_arr[0]} {tmp_arr[-1]}"
    return answer
