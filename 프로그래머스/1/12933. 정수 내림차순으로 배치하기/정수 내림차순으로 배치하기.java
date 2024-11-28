import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] s = String.valueOf(n).split(""); //문자열로 바꿈
        Arrays.sort(s, Collections.reverseOrder()); // 역순으로 정렬
        answer = Long.parseLong(String.join("", s));
        
        return answer;
    }
}