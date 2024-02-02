import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        //정렬
        //접두사 찾기 startsWith()
        //이중 for문으로 찾기
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}