import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];

        int idx = 0;
        for (int n : arr) {
            if(n != Arrays.stream(arr).min().getAsInt()) {
                answer[idx++] = n;
            }
        }
        return answer;
    }
}