// 반복문... 비효율적이고 노가다...
// 그럼뭐가잇지...
// 등차수열 n * (첫+끝)/2
// n 은 어떻게 구하지
// (b-a) + 1  근데 a가 클 땐..?
// 절대값.. abs

class Solution {
    public long solution(int a, int b) {
        long n = Math.abs(b-a) + 1;
        long answer = n * (a+b) /2;
        return answer;
    }
}