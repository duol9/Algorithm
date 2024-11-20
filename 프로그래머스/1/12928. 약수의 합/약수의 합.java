class Solution {
    public int solution(int n) {
        // 나눠떨어지면 약수임
        int answer = 0;
        
        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}