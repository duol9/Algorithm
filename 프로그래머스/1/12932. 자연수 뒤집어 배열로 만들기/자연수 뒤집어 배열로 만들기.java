class Solution {
    public int[] solution(long n) {
        String sn = String.valueOf(n);
        int [] answer = new int[sn.length()];

        for (int i = 0; i<answer.length; i++) {
            answer[i] = (int)(n%10);  // 일의 자리부터 해당 값이 나머지로 나옴
            n /= 10;
        }
        return answer;
    }
}