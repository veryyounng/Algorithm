def solution(s):
    answer = ""
    words = s.split(' ')
    
    for i, word in enumerate(words):
        if word:
            answer += word[0].upper() + word[1:].lower()
        else:
            answer += word
        # 마지막 단어가 아니면 공백 추가
        if i != len(words) - 1:
            answer += " "
    
    return answer
