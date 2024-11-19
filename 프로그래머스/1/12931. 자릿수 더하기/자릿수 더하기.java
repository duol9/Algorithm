import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String nums = Integer.toString(n);

        for (int i=0; i<nums.length(); i++) {
            answer += Integer.parseInt(nums.substring(i, i+1));  // i부터 i+1번째 까지 문자열 잘라서 정수형으로 변환
        }

        return answer;
    
    }   
}